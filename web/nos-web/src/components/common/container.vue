<template>
<!-- 布局组件 -->
    <div id="container">
        <div id="header">
            <slot name="header"/>
        </div>
        <div id="body">
            <div id="aside">
                <slot name="aside"/>
            </div>
            <div id="main">
                <slot name="main"/>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'c-container'
}
</script>

<style scoped>
    #container{
    position: relative;
    width: 100%;
    height: 100%;
    background-color: darkgreen;
  }
  #header{
    width: 100%;
    height: 10%;
    background-color: aquamarine;
  }
  #body{
    width: 100%;
    height: 90%;
    display: flex;
    flex-direction: row;
  }
  #aside{
    width: 10%;
    height: 100%;
    background-color: aqua;
    /* background:linear-gradient(to bottom, #191970, 70%, #0000CD); */
  }
  #main{
    width: 90%;
    height: 100%;
    background-color: brown;
  }
</style>>
