<template>
    <el-row class="container">
        <el-col class="header" :span="24">
            <el-col class="header-logo" :span="10" :class="{'shut-logo': !isAside}">
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
                        <el-dropdown-item @click.native="exit">退出登录</el-dropdown-item>
                    </el-dropdown-menu>
                </el-dropdown>
            </el-col>
        </el-col>
        <el-col class="main" :span="24">
            <el-col :class="isAside ? 'aside' : 'menu-shut'">
                <aside-Menu :isAside="isAside"></aside-Menu>
            </el-col>
            <el-col class="body" :span="24">
                <!-- 内容显示区域 -->
                <div class="main-content">
                    <transition name="fade" mode="out-in">
                        <router-view/>
                    </transition>
                </div>
                
                <el-col class="main-bottom">
                    <span>2022 小说运营系统 ccy出品</span>
                </el-col>
            </el-col>
        </el-col>          
    </el-row>
  
</template>

<script>
import AsideMenu from '../../components/main/aside-menu.vue'
import { success } from '../../utils/message'
import { clearLsItem } from '../../utils/store'

export default {
    components: {AsideMenu},
    data(){
        return {
            msg: 'main',
            sysName: '小说运营系统',
            sysShortName: 'nos',
            isAside: true
        }
    },
    methods:{
        setAside(){
            this.isAside = !this.isAside;
        },
        exit(){
            clearLsItem();
            success("退出登录");
            this.$router.push({name: '/'});
        }
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
        width: 250px;
        flex: 0 0 250px;
        background-color: rgb(230, 222, 222);
    }
    .body{
        position: relative;
        background-color: rgb(240, 236, 236);
    }
    .main-content{
        height: 95%;
        overflow: hidden;
    }
    .main-bottom{
        position: fixed;
        height: 30px;
        line-height: 30px;
        bottom: 0;
        border-top: 1px white solid;
        text-align: center;
        cursor: default;
        z-index: 1000;
        background-color: rgb(46, 54, 54);
    }

    .menu-shut {
        width: 70px;
        flex: 0 0 70px;
    }
    
    .shut-logo{
        width: 70px;
    }
</style>