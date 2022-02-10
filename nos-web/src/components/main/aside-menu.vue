<template>
     <el-menu unique-opened
             :default-active="menuActiveName || 'home'"
             :collapse-transition="false"
             :collapse="isAside">
             <!-- @click="$router.push({name: homeName)" -->
        <el-menu-item :index="homeName" class="menu-item" @click="$router.push({name: homeName})">
            <i class="el-icon-s-grid"></i>
            <span v-if="isAside">首页</span>
        </el-menu-item>
        <el-menu-item :index="ds" class="menu-item">
            <i class="el-icon-s-grid"></i>
            <span v-if="isAside">首页2</span>
        </el-menu-item>
    </el-menu>
</template>

<script>
export default {
    name: 'AsideMenu',
    props: {
            isAside: {
                type: Boolean,
                required: true
            }
    },
    data(){
        return {
            menuActiveName: '',
            homeName: this.$config.homeName
        }
    },
    created(){
        console.log(this.homeName);
    }
}

</script>

<style scoped>
    .el-menu {
        height: 100%;
    }
    .el-menu--collapse{
        width: 250px;
    }
    .menu-item span{
        visibility: visible;
        display: inline;
        padding-left: 20px;
    }
    
</style>