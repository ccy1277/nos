<template>
    <div id="icon">
        <el-avatar :src="pic"/>
        <p>测试图片</p>
    </div>    
</template>

<script>
export default {
    name: 'c-icon',
    props: [
        "size",
    ],
    data(){
        return {
            pic: "https://lin-xin.gitee.io/example/work/static/img/img.146655c9.jpg"
        }
    },
    created(){

    }
}
</script>

<style scoped>
    #icon{
        padding: 10px;
        display: flex;
        position: relative;
    }
    img{
        border-radius: 50%;
        overflow: hidden;
    }
    p{
        text-align: center;
    }
    
</style>