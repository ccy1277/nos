<template>
    <el-col class="information">
        <el-tabs tab-position="right" type="border-card" class="information-tab">
            <el-tab-pane label="查看通知">
                <el-col>
                    <el-table :data="noticeData" highlight-current-row style="width: 100%;" height="220" @row-click="handCol">
                        <el-table-column prop="create_time" label="通知列表" width="200"></el-table-column>
                        <el-table-column prop="notice_to"></el-table-column>
                        <el-table-column prop="notice_from" width="100"></el-table-column>
                    </el-table>
                    <div class="information-page">
                        <el-pagination layout="prev, pager, next" :total="noticeData.length"></el-pagination>
                    </div>
                </el-col>
                <el-col>
                    <h3>通知1</h3>
                    <div class="information-text">
                        发布者：<el-tag class="tags">{{currentData.notice_from || 'from'}}</el-tag><br/>
                        接收者：<el-tag class="tags" v-for="(item, index) in to_tags.tags" :key="index">{{ item }}</el-tag>
                            <el-tag class="tags" v-if="to_tags.tags.length==0">{{ 'to' }}</el-tag><br/>
                        发布时间：<el-tag type="info" class="tags">{{ currentData.create_time != null ? new Date(currentData.create_time).toLocaleString():'create_time' }}</el-tag>
                    </div>
                    <el-input type="textarea" rows="9" resize="none" placeholder="通知正文" v-model="currentData.content" readonly></el-input>
                </el-col>
            </el-tab-pane>
            <el-tab-pane label="发布通知">
                <el-col>
                    <span class="information-title">通知对象：</span>
                    <el-select v-model="value1" multiple placeholder="请选择接收通知的对象" style="width: 100%">
                        <el-option v-for="item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                    </el-select>
                </el-col>
                <el-col>
                    <span class="information-title">通知标题：</span>
                    <el-input clearable v-model="value3" placeholder="请输入通知的标题"></el-input>
                </el-col>
                <el-col>
                    <span class="information-title">通知正文：</span>
                    <el-input type="textarea" rows="16" resize="none" placeholder="请输入内容" v-model="value2"></el-input>
                </el-col>
                <el-button type="primary" class="information-submit">发布</el-button>
            </el-tab-pane>
        </el-tabs>    
    </el-col>
</template>

<script>
import { getNotices } from '../../api/notice/notice'
import { success, error, info } from '../../utils/message'

export default {
    data(){
        return {
            options: [{
                value: '选项1',
                label: '非vip用户'
            }, {
                value: '选项2',
                label: 'vip用户'
            }, {
                value: '选项3',
                label: '作者'
            }, {
                value: '选项4',
                label: '读者'
            }, {
                value: '选项5',
                label: '管理员'
            }],
            value1: [],
            value3: '',
            value2: '',
            newNotice: {
                from: '',
                to: '',
                content: ''
            },
            noticeData: [],
            currentData: {},
            to_tags: {
                tags: []
            }
        }
    },
    created(){
        this.initNotices();
    },
    methods: {
        initNotices(){
            var that = this;
            getNotices({}, function(res){
                if(res.data.state == 1){
                    that.noticeData = res.data.data;
                }else{
                    error("通知列表获取异常")
                }
            }, function(err){
                console.log(err);
            })
        },
        handCol(row, column,event){
            if(this.currentData.notice_id != row.notice_id){
                this.currentData = row;
                this.to_tags.tags = this.currentData.notice_to.split('-');
                this.$set(this.to_tags, "tags", this.currentData.notice_to.split('-'))
            }else{
                info("已显示该条通知");
            }
        }
    }
}
</script>

<style scoped>
    .information{
        height: 100%;
    }
    .information-tab{
        margin: 5px;
        height: 100%;
        color: black;
    }
    .information-title{
        line-height: 50px;
    }
    .information-page{
        float: right;
        margin-top: 10px;
    }
    .information-submit{
        margin-top: 15px;
        margin-left: 50%;
    }
    .information-text{
        margin: 5px;
    }
    .tags{
        margin: 2px 5px;
    }
</style>