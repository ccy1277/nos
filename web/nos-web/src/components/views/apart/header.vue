<template>
    <div id="header">
        <!-- 图片加信息组件 -->
        <el-col :push="1">
            <span id="sys-title" class="el-icon-s-unfold"> 小说运营系统</span>
        </el-col>
        <!-- 未读信息 -->
        
        <el-col :span="1" :push="20">
            <!-- <i class="el-icon-message"></i> -->
            <el-badge value="20">
                <i class="el-icon-message"></i>
            </el-badge>
        </el-col>
        <!-- 头像 -->
        <el-col :span="3" :push="20">
            <el-avatar id="header-profile" :src="profilePhoto" :size="40"/>
            <el-dropdown>
                <span id="header-more">超级管理员</span>
                <i class="el-icon-caret-bottom"></i>
                <el-dropdown-menu slot="dropdown">
                    <el-dropdown-item>退出登录</el-dropdown-item>
                    <el-dropdown-item>更多功能</el-dropdown-item>
                </el-dropdown-menu>
            </el-dropdown>
        </el-col>
    </div>
</template>

<script>
export default {
    name: 'v-header',
    data(){
        return {
            profilePhoto: "http://47.96.18.60/booksys/img/swiper5.png"
        }
    }
}
</script>

<style scoped>
    #header{
        position: relative;
        width: 100%;
        height: 100%;
        top: 20%;
    }    
    #sys-title{
        position: absolute;
        font-size: 25px;
        padding: 0.5%;
        cursor: pointer;
    }
    .el-icon-message{
        position: absolute;
        font-size: 28px;
        cursor: pointer;
    }
    #header-profile{
        vertical-align: middle;
    }
    #header-more{
        display: inline-block;
        vertical-align: middle;
        height: 100%;
        cursor: pointer;
    }
</style>