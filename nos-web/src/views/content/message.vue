<template>
    <el-col class="message">
        <el-col>
            <el-card class="msg-col">
                <el-col :span="24">
                    <el-form :inline="true" :model="searchData" class="demo-form-inline">
                        <el-form-item>
                            <el-input v-model="searchData.value" placeholder="请输入您想要搜索的关键字" prefix-icon="el-icon-search" clearable>
                                <el-select v-model="searchData.key" slot="prepend" class="search-key">
                                    <el-option label="小说" value="novel"></el-option>
                                    <el-option label="用户" value="user"></el-option>
                                </el-select>
                                <el-button type="primary" @click="onSubmit" slot="append">关键搜索</el-button>
                            </el-input>
                        </el-form-item>
                        <el-form-item>
                            <el-select v-model="searchData.values" placeholder="请选择" clearable>
                                <el-option-group v-for="group in options" :key="group.label" :label="group.label">
                                    <el-option v-for="item in group.options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                                </el-option-group>
                            </el-select>
                            <el-button type="primary" class="search-btn" @click="onSubmit">快捷搜索</el-button>
                        </el-form-item>
                    </el-form>
                </el-col>
            </el-card>
        </el-col>
        <el-col class="msg-col" :span="24">
            <el-card class="msg-table">
                <el-table :data="tableData" border style="width: 99%">
                    <el-table-column prop="id" label="id" width="180"></el-table-column>
                    <el-table-column prop="name" label="名字" width="180"></el-table-column>
                    <el-table-column prop="update_time" label="最新更新时间"></el-table-column>
                    <el-table-column prop="list" label="榜单"></el-table-column>
                    <el-table-column prop="cat" label="分类"></el-table-column>
                    <el-table-column prop="author_name" label="作者"></el-table-column>
                    <el-table-column prop="status" label="状态"></el-table-column>
                    <el-table-column prop="intro" label="简介"></el-table-column>
                </el-table>
            </el-card>
        </el-col> 
    </el-col>
</template>

<script>
export default {
    data() {
        return {
            searchData: {
                key: 'novel',
                value: '', // 关键搜索 
                values: '' // 快捷搜索
            },
            options: [
                {
                label: '按用户检索',
                options: [{
                    value: 'allUsers',
                    label: '全部用户'
                    }, {
                    value: 'vipUsers',
                    label: '会员'
                    }, {
                    value: 'simpleUsers',
                    label: '普通用户'
                }]
            }, {
                label: '按小说分类检索',
                options: [{
                    value: 'urban',
                    label: '都市小说'
                    }, {
                    value: 'fantasy',
                    label: '玄幻小说'
                    }, {
                    value: 'immortal',
                    label: '仙侠小说'
                    }, {
                    value: 'affection',
                    label: '言情小说'
                }]
            },{
                label: '按小说排行榜检索',
                options: [{
                    value: 'clicks',
                    label: '点击榜',
                }, {
                    value: 'monkets',
                    label: '月票榜',
                },{
                    value: 'stars',
                    label: '收藏榜'
                }]
            }],
            tableData: []
            }
    }
}
</script>

<style scoped>
    .message{
        height: 100%;
        overflow-y: scroll;
        overflow-x: hidden;
    }
    .search-key{
        width: 100px;
    }
    .search-btn{
        color: rgb(144,147,153);
        background-color: rgb(245,247,250);
        border-color: rgb(220,223,230);
        border-radius: 0;
    }
    .msg-col{
        margin: 3px 3px;
    }
    .msg-table{
        min-height: 600px;
        
    }
</style>