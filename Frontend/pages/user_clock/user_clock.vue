<template>
	<view>
		<view v-for="(contest, index) in contests" :key="index" class="contest-item">
			<uni-icons custom-prefix="iconfont" type="icon-clock1" size="25" class="icon-img"></uni-icons>
			<text class="clock-text">距离: </text>
				<!-- 显示比赛图片 -->
			<image :src="contest.img"  mode="aspectFit"></image>
				<!-- 显示比赛名称 -->
			<text class="contest-name">{{ contest.name }}</text>
				<!-- 倒计时 -->
			<uni-section class="clock-time">
				<text class="clock-time-text">仅有 :</text>
				<uni-countdown :font-size="25" :day="1" :hour="1" :minute="12" :second="40" />
			</uni-section>
				
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				contests:[
							{
								"name":'第十六届“华中杯”大学生数学建模大赛',
								"img":'https://publicqn.saikr.com/60de44f9c4d067fd59ee5cb22db4ee8c1712110232672.png',
							},
							{
								"name":'第十六届“华中杯”大学生数学建模大赛',
								"img":'https://publicqn.saikr.com/60de44f9c4d067fd59ee5cb22db4ee8c1712110232672.png',	
							}
						] 
					}
				}
	}
	
</script>

<style>
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
	
	.clock-text{
		margin-left: 10rpx;
		margin-top: 5rpx;
	}
	
	.contest-item image{
		width: 900rpx;
		height: 320rpx;
	}
	
	.contest-name{
		font-size: 28rpx;
		margin: auto;
	}
	
	.clock-time{
		display: flex;
		margin-left: 20rpx;
	}
	.clock-time uni-countdown{
		display: flex;
		margin-top: -60rpx;
		margin-left: 90rpx;
	}
	
	.clock-time-text{
		font-size: 35rpx;
	}
	
	
	
	
</style>
