<template>
  <div id="app">
    <c-container>
      <template #main>
        <router-view/>
      </template>
    </c-container>
    
  </div>
</template>

<script>
import cContainer from './components/views/main/container.vue'
export default {
  name: 'App',
  components: { cContainer }
}
</script>

<style>
  #app{
    width: 100%;
    height: 100%;
  }
  
</style>
