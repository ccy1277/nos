<template>
  <div id="app">
    <transition name="fade" mode="out-in">
      <router-view/>
    </transition>
  </div>
</template>

<style>
  #app{
    width: 100%;
    height: 100%;
  }
  body, html{
    width: 100%;
    height: 100%;
    overflow: hidden;
    margin: 0;
    padding: 0;
    font-family: sans-serif, PingFang SC, Hiragino Sans GB, Microsoft YaHei, SimSun;
    background-color: antiquewhite;
  }
</style>
