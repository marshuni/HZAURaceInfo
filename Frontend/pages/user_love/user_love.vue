<template>
  <view>
    <view v-for="(contest, index) in contests" :key="index" class="contest-item">
      <!-- 显示比赛图片 -->
      <image :src="contest.img"  mode="aspectFit"></image>

      <!-- 显示比赛名称 -->
      <text>{{ contest.name }}</text>

      <!-- 显示比赛时间 -->
      <text>报名时间：{{ contest.clock1 }}</text>
	  <text>比赛时间：{{ contest.clock2 }}</text>
    </view>
  </view>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      contests: [] // 存储所有比赛对象的数组
    };
  },
  created() {
    // 在组件挂载后发送请求
    this.change();
  },
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
			console.error('Error fetching contests data:', err);
		}
	  });
      
    }
  }
};
</script>

<style scoped>
	.contest-item{
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
		margin: 20rpx 30rpx;
		border: solid;
		border-color: #efefef;
		border-radius: 30rpx;
		padding: 20rpx;
	}
	.contest-item image{
		width: 900rpx;
		height: 320rpx;
	}
	
	.contest-item text{
		font-size: 28rpx;
	}
</style>
