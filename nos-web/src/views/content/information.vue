<template>
    <el-col class="information">
        <el-tabs tab-position="right" type="border-card" class="information-tab">
            <el-tab-pane label="查看通知">
                <el-col>
                    <el-table :data="tableData" highlight-current-row style="width: 100%;" height="220">
                        <el-table-column prop="date" label="通知列表" width="200"></el-table-column>
                        <el-table-column prop="address"></el-table-column>
                        <el-table-column prop="name" width="100"></el-table-column>
                    </el-table>
                    <div class="information-page">
                        <el-pagination layout="prev, pager, next" :total="1000"></el-pagination>
                    </div>
                </el-col>
                <el-col>
                    <h3>通知1</h3>
                    <div class="information-text">
                        发布者：<el-tag>ccy1277</el-tag><br/>
                        接收者：<el-tag>vip用户</el-tag><br/>
                        发布时间：<el-tag type="info">2022-01-02 23:25:04</el-tag>
                    </div>
                    <el-input type="textarea" rows="9" resize="none" placeholder="通知正文" v-model="value4" readonly></el-input>
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
            value4: '上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄上海市普陀区金沙江路 1516 弄',
            tableData: [{
            date: '2016-05-02',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1518 弄'
          }, {
            date: '2016-05-04',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1517 弄'
          },{
            date: '2016-05-04',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1517 弄'
          },{
            date: '2016-05-04',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1517 弄'
          }, {
            date: '2016-05-01',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1519 弄'
          }, {
            date: '2016-05-03',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1516 弄'
          }]
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
</style>