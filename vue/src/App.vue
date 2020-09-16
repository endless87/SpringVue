<template>
<div>
  <!-- <img alt="Vue logo" src="./assets/logo.png"> -->
  <!-- <HelloWorld msg="Hello !! Vue.js"/> -->
  <Main msg="안녕하세요 !! 서버 개발 중 !!"/>
  <input type="button" id="button" value="데이터 불러오기">
</div>
</template>

<script>
/* import HelloWorld from './components/HelloWorld.vue' */
import Main from './components/Main.vue'

export default {
  name: 'App',
  components: {
    Main
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
