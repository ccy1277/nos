<template>
    <div id="header">
        <!-- 图片加信息组件 -->
        <div id="sys-title">
            <span class="el-icon-s-unfold"> 小说运营系统</span>
        </div>

        <!-- 未读信息 -->
        <!--  -->
    </div>
</template>

<script>
export default {
    name: 'v-header',
    data(){
        return {
            
        }
    }
}
</script>

<style scoped>
    #header{
        position: relative;
        width: 100%;
        height: 100%;
    }    
    #sys-title{
        height: 100%;
        width: 40%;
    }
    #sys-title span{
        position: absolute;
        width: 250px;
        font-size: 25px;
        padding: 1.5%;
        cursor: pointer;
    }

</style>