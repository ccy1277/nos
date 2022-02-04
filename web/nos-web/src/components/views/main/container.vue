<template>
<!-- 布局组件 -->
    <div id="container">
        <div id="container-header">
          <v-header/>
        </div>
        <div id="container-body">
          <div id="container-aside">

          </div>
          <div id="container-main">
            <slot name="main"/>
          </div>
        </div>
    </div>
</template>

<script>
import vHeader from '../apart/header.vue'
export default {
    name: 'c-container',
    components: { vHeader }
}
</script>

<style scoped>
    #container{
    position: relative;
    color: white;
    width: 100%;
    height: 100%;
  }
  #container-header{
    width: 100%;
    height: 10%;
    background-color: rgb(64,158,255);
  }
  #container-body{
    width: 100%;
    height: 90%;
    display: flex;
    flex-direction: row;
  }
  #container-aside{
    width: 15%;
    height: 100%;
    background-color: rgb(50,65,87);
  }
  #container-main{
    width: 85%;
    height: 100%;
    background-color: antiquewhite;
  }
</style>>
