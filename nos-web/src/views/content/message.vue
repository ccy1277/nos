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
                <el-table :data="tableData" border style="width: 99%" @cell-click="handcell">
                    <el-table-column v-for="column in columns" :prop="column.prop" :label="column.label" :width="column.width" :key="column"></el-table-column>
                </el-table>
            </el-card>
        </el-col> 
    </el-col>
</template>

<script>
export default {
    data() {
        return {
            columns: this.$config.msgColumns.novelColumns,
            searchData: {
                key: 'novel',
                value: '',  // 关键搜索 
                values: ''  // 快捷搜索
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
            tableData: [{
                id: 1,
                name: 1
            },{
                id: 2,
                name: 2
            }]
            }
    },
    methods: {
        handcell(row, column, cell, event){
            console.log(row, column, cell, event);
            this.columns = this.$config.msgColumns.userColumns;
        }
    },
    watch: {
        'columns': function(val){
            console.log(val);
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
        height: 100%;
    }
    .msg-table{
        height: 100%;
        
    }
</style>