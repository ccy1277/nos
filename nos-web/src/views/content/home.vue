<template>
    <el-row class="home">
        <el-col :span="24">
            <el-col :span="10">
                <el-card class="box-s" :body-style="{padding: '0'}">
                    <!-- <div class="title" style="">个人信息</div> -->
                    <el-col class="profile-img">
                        <img src="../../assets/imgs/profile.jpg" alt="sry" >
                        <span class="my-content">欢迎您 ccy1277</span>
                    </el-col>
                    <el-descriptions :column="2" class="profile">
                        <el-descriptions-item label="性别:" label-class-name="my-label" content-class-name="my-content" :span="1">男</el-descriptions-item>
                        <el-descriptions-item label="年龄:" label-class-name="my-label" content-class-name="my-content" :span="1">20</el-descriptions-item>
                        <el-descriptions-item label="手机号码:" label-class-name="my-label" content-class-name="my-content" :span="1">19967294663</el-descriptions-item>
                        <el-descriptions-item label="邮箱:" label-class-name="my-label" content-class-name="my-content" :span="1">ccy1277@139.com</el-descriptions-item>
                        <el-descriptions-item label="地区:" label-class-name="my-label" content-class-name="my-content" :span="1">湖南株洲</el-descriptions-item>
                        <el-descriptions-item label="权限:" label-class-name="my-label" content-class-name="my-content" :span="1">超管</el-descriptions-item>
                        <el-descriptions-item label="加入时间:" label-class-name="my-label" content-class-name="my-content" :span="1">2022-02-22</el-descriptions-item>
                    </el-descriptions>
                </el-card>
            </el-col>  
        </el-col>
        <el-col :span="18">
            <el-card class="box-m" :body-style="{padding: '0'}">
                <div class="title">最新通知</div>
                <el-col :span="22" :push="1">
                    <div class="information-text">
                        <el-input v-model="noticeText" type="textarea" readonly rows="7" resize="none"></el-input>
                    </div>
                    <i  class="more-informaion">更多通知</i>
                </el-col>
            </el-card>
        </el-col>
        <el-col :span="6">
            <el-card class="box-s" :body-style="{padding: '0'}">
                <div class="title">网站数据</div>
                <div class="db">999999</div>
            </el-card>
        </el-col>
        <el-col :span="24">
            <el-col :span="14">
                <el-card class="box-m" :body-style="{padding: '0'}">
                    <div class="title">待开发</div>
                    
                </el-card>
            </el-col>
            <el-col :span="10">
                <el-card class="box-m" :body-style="{padding: '0'}">
                    <div class="title">待开发</div>
                    
                </el-card>
            </el-col>
        </el-col>
    </el-row>
</template>

<script>
export default {
    data(){
        return {
            noticeText: "函数的克己奉公吧奥斯卡金凤凰圣诞节分公司假道伐虢上课讲会计师副书记电饭锅设计风格是快捷方式科技封锁开始减肥浩少到家函数的克己奉公吧奥斯卡金凤凰圣诞节分公司假道伐虢上课讲会计师副书记电饭锅设计风格是快捷方式科技封锁开始减肥浩少到家函数的克己奉公吧奥斯卡金凤凰圣诞节分公司假道伐虢上课讲会计师副书记电饭锅设计风格是快捷方式科技封锁开始减肥浩少到家函数的克己奉公吧奥斯卡金凤凰圣诞节分公司假道伐虢上课讲会计师副书记电饭锅设计风格是快捷方式科技封锁开始减肥浩少到家函数的克己奉公吧奥斯卡金凤凰圣诞节分公司假道伐虢上课讲会计师副书记电饭锅设计风格是快捷方式科技封锁开始减肥浩少到家"
        }
    }
}
</script>

<style scoped>
    .home{
        height: 100%;
        overflow-y: scroll;
        cursor: default;
        background-image: url("../../assets/imgs/home.png");
    }
    .box-m{
        height: 300px;
        margin: 3px;
    }
    .box-s{
        height: 250px;
        margin: 3px;
    }
    .title{
        color: rgb(19,133,238);
        font-weight: 400;
        font-size: 25px;
        line-height: 60px;
        padding-left: 20px
    }
    .db{
        font-weight: 600;
        letter-spacing: 3px;
        font-size: 22px;
        line-height: 120px;
        text-align: center;
    }
    .profile{
        margin-left: 50px;
        color: black;
    }
    .profile-img{
        line-height: 70px;
        text-align: center;
        padding-bottom: 10px;
        margin-bottom: 20px;
        border-bottom: 1px gray solid;
    }
    .profile-img img{
        width: 70px;
        border-radius: 50%;
        vertical-align: middle;
    }
    .profile-img span{
        padding-left: 30px;
        vertical-align: middle;
        line-height: 70px;
        font-size: 22px;
        font-weight: 600;
    }
    .more-informaion{
        float: right; 
        cursor: pointer;
    }
    .more-informaion:hover{
        color: aqua;
    }
    .information-text{
        margin-top: 10px;
        margin-bottom: 20px;
        height: 150px;
        letter-spacing: 3px;
    }
    /**
    当我们在项目中需要给element组件加上一些自定义样式的时候，往往是不生效的。这是因为Vue项目中使用第三方框架的时候，
    Vue中有scoped，声明了样式是在组件范围内生效的，避免了不同组件的样式污染
    */
    /* 深作用选择器  >>> 方式只能用在原生CSS语法 */
    >>> .my-label{
        font-size: 18px;
        font-weight: 600;
        font-style: oblique;
        margin: 5px;
    }
    >>> .my-content{
        color: black;
    }
</style>