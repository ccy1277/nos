<template>
  <el-card class="login-card">
    <el-form :model="dataForm" status-icon :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <h1 class="form-title">欢迎登录</h1>
      <el-form-item  prop="username">
        <el-input prefix-icon="el-icon-user" type="text" v-model="dataForm.username" autocomplete="off">
        </el-input>
      </el-form-item>
      <el-form-item  prop="pass">
        <el-input type="password" prefix-icon="el-icon-lock" v-model="dataForm.pass" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')" class="submit-btn">登录</el-button>
      </el-form-item>
    </el-form>
  </el-card>
  
</template>

<script>
import {success, error } from '../../utils/message'
import {setUser} from '../../utils/utils'
import {login} from '../../api/user/user'

export default {
    data() {
      var validatePass = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请输入用户名'));
        } else {
          if (this.dataForm.pass !== '') {
            this.$refs.ruleForm.validateField('pass');
          }
          callback();
        }
      };
      var validatePass2 = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请输入密码'));
        } else {
          callback();
        }
      };
      return {
        dataForm: {
          username: '17716776553',
          pass: 'ccy17716776553'
        },
        rules: {
          username: [
            { validator: validatePass, trigger: 'blur' }
          ],
          pass: [
            { validator: validatePass2, trigger: 'blur' }
          ]
        }
      };
    },
    methods: {
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            var that = this;
            login(this.dataForm, function(res){
              console.log(res);
              if(res.data.state == 1){
                success(res.data.info);
                setUser(res.data.data);
                that.$router.push({name: that.$config.homeName});
              }else{
                error(res.data.info)
              }
            }, function(err){
              console.log(err);
            });
          } else {
            return false;
          }
        });
      }
    }
  }
</script>

<style scoped>
  .login-card{
    width: 500px;
    margin: 0 auto;
    margin-top: 100px;
    padding-right: 100px;
    padding-bottom: 45px;
    text-align: center;
  }
  .form-title{
    margin-left: 80px;
    cursor: pointer;
  }
  .submit-btn{
    width: 360px;
    margin-top: 30px;
  }
</style>