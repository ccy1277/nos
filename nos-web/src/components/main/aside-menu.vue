<template>
     <el-menu unique-opened
             :default-active="asideNav || 'home'"
             :collapse-transition="false"
             :collapse="isAside">
        <el-menu-item :index="menu.name" class="menu-item" v-for="(menu, index) in navMenu" :key="index" @click="handleNav(menu.name)">
            <i :class="menu.icon"></i>
            <span v-if="isAside">{{ menu.title }}</span>
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
            navMenu: this.$config.navMenu
        }
    },
    methods:{
        handleNav(name){
            this.$router.push({name: name});
        }
    },
    computed: {
        asideNav(){
            return this.$store.state.currentAsideNav;
        }
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