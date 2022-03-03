<template>
    <el-row class="home">
        <el-col :span="24">
            <el-col :span="10">
                <div class="box-s" :body-style="{padding: '0'}">
                    <el-col class="profile-img">
                        <img src="../../assets/imgs/profile.jpg" alt="sry" >
                        <span class="my-content">欢迎您! {{ personal_msg.username }}</span>
                    </el-col>
                    <el-descriptions :column="2" class="profile">
                        <el-descriptions-item label="性别:" label-class-name="my-label" content-class-name="my-content" :span="1">{{ personal_msg.sex }}</el-descriptions-item>
                        <el-descriptions-item label="年龄:" label-class-name="my-label" content-class-name="my-content" :span="1">{{ personal_msg.age }}</el-descriptions-item>
                        <el-descriptions-item label="手机号码:" label-class-name="my-label" content-class-name="my-content" :span="1">{{ personal_msg.id }}</el-descriptions-item>
                        <el-descriptions-item label="邮箱:" label-class-name="my-label" content-class-name="my-content" :span="1">{{ personal_msg.email }}</el-descriptions-item>
                        <el-descriptions-item label="地区:" label-class-name="my-label" content-class-name="my-content" :span="1">{{ personal_msg.area }}</el-descriptions-item>
                        <el-descriptions-item label="权限:" label-class-name="my-label" content-class-name="my-content" :span="1">{{ personal_msg.is_admin ? '管理员' : '普通用户' }}</el-descriptions-item>
                        <el-descriptions-item label="加入时间:" label-class-name="my-label" content-class-name="my-content" :span="1">{{ new Date(personal_msg.entry_time).toLocaleString() }}</el-descriptions-item>
                    </el-descriptions>
                </div>
            </el-col>
            <el-col :span="13" :push="1">
                <el-carousel interval="4000" arrow="never" trigger="click">
                    <el-carousel-item v-for="item in 4 " :key="item">
                        <h3 class="swift">昨夜雨疏风骤 浓睡不消残酒</h3>
                    </el-carousel-item>
                </el-carousel>

            </el-col> 
        </el-col>
        <el-col :span="12">
            <div class="box-m" :body-style="{padding: '0'}">
                <div class="title el-icon-message"> 最新通知</div>
                <el-col :span="22" :push="1">
                    <div class="information-text">
                        <el-input v-model="noticeText" type="textarea" readonly rows="7" resize="none"></el-input>
                    </div>
                    <i class="more-informaion" @click="$router.push({name: 'information'})">更多通知</i>
                </el-col>
            </div>
        </el-col>
        <el-col :span="4" :push="8">
            <el-card class="box-s" :body-style="{padding: '0'}">
                <div class="title">网站数据</div>
                <div class="db">
                    <span class="db">今日总月票量：</span><span>2</span><br/>
                    <span class="db">今日总月票量：</span><span>2</span><br/>
                    <span class="db">今日总月票量：</span><span>2</span><br/>
                    <span class="db">今日总月票量：</span><span>2</span>
                </div>
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
import { getUser, setMsg } from '../../utils/utils'
import { error } from '../../utils/message'
import { getUserMsg } from '../../api/user/user'
import { getNewestNotice } from '../../api/notice/notice'
export default {
    data(){
        return {
            personal_msg: '',
            noticeText: ''
        }
    },
    created(){
        this.initUserMsg({id: getUser().id});
    },
    methods: {
        async initUserMsg(id){
            var that = this;
            await getUserMsg(id, function(res){
                if(res.data.state == 1){
                    setMsg(res.data.data);
                    that.personal_msg = res.data.data;
                }else{
                    error("初始化信息异常");
                }
            }, function(err){
                console.log(err);
            });
            
            this.initNotice();
        },
        initNotice(){
            var that = this;
            getNewestNotice({}, function(res){
                if(res.data.state == 1){
                    that.noticeText = res.data.data.content;
                }else{
                    error("初始化信息异常");   
                }
            }, function(err){
                console.log(err);
            })
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
        background-repeat:no-repeat;
        background-size: 100% auto;
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
        letter-spacing: 1px;
        font-size: 16px;
        line-height: 40px;
        padding-left: 10px;
    }
    .swift{
        color: black;
        font-size: 25px;
        letter-spacing: 3px;
        opacity: 0.75;
        line-height: 250px;
        text-align: center;
        margin: 0;
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
        color: gray;
    }
    .more-informaion:hover{
        color: rgb(144, 180, 180);
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
    >>> .el-textarea__inner{
        background-color: rgb(0,0,0,0);
    }
</style>