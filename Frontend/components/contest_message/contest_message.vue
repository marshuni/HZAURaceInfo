<template>
  <view>
	  <view >
		  <button @click="change">加油</button>
	  </view>
    <view v-for="(contest, index) in contests" :key="index" class="contest-item">
      <!-- 显示比赛图片 -->
      <img :src="contest.img" alt="Contest Image" />

      <!-- 显示比赛名称 -->
      <text>{{ contest.name }}</text>

      <!-- 显示比赛时间 -->
      <text>{{ contest.clock1 }} - {{ contest.clock2 }}</text>
    </view>
  </view>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      contests: [{}] // 存储所有比赛对象的数组
    };
  },
  // created() {
  //   // 在组件挂载后发送请求
  //   this.jiazai();
  // },
  methods: {
    change() {
      // 发送 GET 请求
	  uni.request({
	  	url: 'http://127.0.0.1:80/api/userInfo',
		method: 'GET',
		success:(res) => {
			this.contests = res.data;
			console.log(this.contests)
		},
		fail: (err) => {
			console.error('Error fetching contests data:', error);
		}
	  });
      
    }
  }
};
</script>

<style scoped>
.contest-item {
  margin-bottom: 20px;
}
</style>
