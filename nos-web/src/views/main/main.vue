<template>
    <el-row class="container">
        <el-col class="header" :span="24">
            <el-col class="header-logo" :span="10" :class="{'shut-aside': !isAside}">
                {{ isAside ? sysName : sysShortName}}
            </el-col>
            <el-col :span="4">
                <div class="aside-tool" @click="setAside">
                    <i :class="{'el-icon-s-fold': isAside, 'el-icon-s-unfold': !isAside}"></i>
                </div>
            </el-col>
            <el-col :span="10" class="header-profile">
                <el-badge class="el-icon-message" is-dot=""></el-badge>
                <img src="../../assets/imgs/profile.jpg" alt="sry">
                <el-dropdown>
                    <span class="el-dropdown-link">
                        用户名<i class="el-icon-arrow-down el-icon--right"></i>
                    </span>
                    <el-dropdown-menu slot="dropdown">
                        <el-dropdown-item>功能1</el-dropdown-item>
                        <el-dropdown-item>功能2</el-dropdown-item>
                        <el-dropdown-item>退出登录</el-dropdown-item>
                    </el-dropdown-menu>
                </el-dropdown>
            </el-col>
        </el-col>
        <el-col class="main" :span="24">
            <el-col class="aside" :class="{'shut-aside': !isAside}">
                Aside
            </el-col>
            <el-col class="body" :span="24">
                <el-card class="main-content">
                    <!-- 内容显示区域 -->
                    <transition name="fade" mode="out-in">
                        <router-view/>
                    </transition>
                </el-card>
            </el-col>
        </el-col>          
    </el-row>
  
</template>

<script>
export default {
    data(){
        return {
            msg: 'main',
            sysName: '实验室预约系统',
            sysShortName: 'nos',
            isAside: true
        }
    },
    methods:{
        setAside(){
            this.isAside = !this.isAside;
        },
    }
}
</script>

<style scoped>
    .container{
        position: absolute;
        top: 0;
        bottom: 0;
        width: 100%;
        color: white;
    }
    .header{
        height: 60px;
        background-color: rgb(46, 54, 54);
    }
    .header-logo{
        width: 260px;
        line-height: 60px;
        cursor: default;
        font-size: 25px;
        text-align: center;
    }
    .header-profile{
        float: right;
        margin-right: 20px;
        text-align: right;
        line-height: 60px;
        cursor: default;
    }
    .el-icon-message{
        font-size: 25px;
        vertical-align: middle;
        margin-right: 15px;
        cursor: pointer;
    }
    .header-profile img{
        width: 30px;
        margin-right: 10px;
        border-radius: 50%;
        vertical-align: middle;
    }
    .aside-tool{
        /* float: left; */
        width: 30px;
        height: 50px;
        font-size: 25px;
        cursor: pointer;
        line-height: 60px;
    }
    .main{
        position: absolute;
        top: 60px;
        bottom: 0;
        display: flex;
        overflow: hidden;
    }
    .aside{
        width: 270px;
        background-color: rgb(230, 222, 222);
        color: #000;
    }
    .body{
        background-color: antiquewhite;
    }
    .main-content{
        margin: 10px;
    }


    .shut-aside{
        width: 70px;
    }
</style>