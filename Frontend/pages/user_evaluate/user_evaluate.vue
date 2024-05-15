<template>
	<view>
	  <view v-for="(contest, index) in contests" :key="index" class="contest-item">
	    
		<!-- 显示比赛图片 -->
	    <image :src="contest.img"  mode="aspectFit"></image>
	    
		<!-- 显示比赛名称 -->
	    <text>{{ contest.name }}</text>
		
		<!-- 打星 -->
		<view class="section-content">
			<uni-section class="section-star">
				<text>总体评分: </text>
				<uni-rate allow-half :value="contest['one-grade']" />
			</uni-section>
			
			<uni-section class="section-star">
				<text>竞赛难度：</text>
				<uni-rate allow-half :value="contest['two-grade']" />
			</uni-section>
			
			<uni-section class="section-star">
				<text>获奖难度：</text>
				<uni-rate allow-half :value="contest['three-grade']" />
			</uni-section>
			
			<uni-section class="section-star">
				<text>含金量  ：</text>
				<uni-rate allow-half :value="contest['four-grade']" />
			</uni-section>
			
			<view class="word-content">
				<text>文字评价：</text>
				<text>{{ contest['content-detial']}}</text>
			</view>
		</view>
	    
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
								"one-grade":4,
								"two-grade":4,
								"three-grade":3.5,
								"four-grade":4,
								"content-detial":'啊啊啊啊啊什么东西，啥也不会，救命吖啊啊啊啊啊啊啊啊'
								
							},
							{
								"name":'第十六届“华中杯”大学生数学建模大赛',
								"img":'https://publicqn.saikr.com/60de44f9c4d067fd59ee5cb22db4ee8c1712110232672.png',
								"one-grade":4,
								"two-grade":4,
								"three-grade":3.5,
								"four-grade":4,
								"content-detial":'啊啊啊啊啊什么东西，啥也不会，救命吖啊啊啊啊啊啊啊啊'
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
	.contest-item image{
		width: 900rpx;
		height: 320rpx;
	}
	
	.contest-item text{
		font-size: 28rpx;
		margin: auto;
	}
	
	/* 评分领域 */
	.section-content{
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
	}
	.section-star {
		display: flex;
	}
	.section-star text{
		width: 120rpx;
		font-weight: 100;
	}
	.section-star uni-rate{
		display: flex;
		margin-left: 120rpx;
		margin-top: -40rpx;
	}
	.word-content{
		margin-top: 20rpx;
	}
	
</style>
