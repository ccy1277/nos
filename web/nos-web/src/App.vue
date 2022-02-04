<template>
  <div id="app">
    <c-container>
      <template #header>
        <p>header</p>
      </template>
      <template #aside>
        <p>aside</p>
      </template>
      <template #main>
        <p>main</p>
      </template>
    </c-container>
    <router-view/>
  </div>
</template>

<script>
import cContainer from './components/common/container.vue'
export default {
  name: 'App',
  components: { cContainer }
}
</script>

<style>
  #app{
    position: absolute;
    width: 100%;
    height: 100%;
    background-color: antiquewhite;
  }
  
</style>
