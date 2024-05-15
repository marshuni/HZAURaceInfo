<template>
	<view class="content">
		<view class="uni-margin-wrap">
			<swiper class="swiper">
				<swiper-item>
					<image src="D:\DeskTop\contest_app\uni-app-contest-message-2\static\assets\image1.jpg"></image>
				</swiper-item>
				<swiper-item>
					<image src="D:\DeskTop\contest_app\uni-app-contest-message-2\static\assets\image1.jpg"></image>
				</swiper-item>
				<swiper-item>
					<image src="D:\DeskTop\contest_app\uni-app-contest-message-2\static\assets\image1.jpg"></image>
				</swiper-item>
			</swiper>
		</view>
		<view class="icon-content ">
			<navigator class="icon-nav">
				<uni-icons custom-prefix="iconfont" type="icon-bangonglou" size="20" class="icon-img" >
					<text class="icon-text" >院级</text>
				</uni-icons>
			</navigator>
			<navigator class="icon-nav">
				<uni-icons custom-prefix="iconfont" type="icon-24gl-building" size="20" class="icon-img">
					<text class="icon-text">校级</text>
				</uni-icons>
			</navigator>
			<navigator class="icon-nav">
				<uni-icons custom-prefix="iconfont" type="icon-shenggonganting" size="20" class="icon-img">
					<text class="icon-text">省级</text>
				</uni-icons>
			</navigator>
			<navigator class="icon-nav">
				<uni-icons custom-prefix="iconfont" type="icon-line-ancientgatechengloumen" size="20" class="icon-img">
					<text class="icon-text">国家级</text>
				</uni-icons>
			</navigator>	
		</view>
		<view class="img-content">
			<navigator class="img-nav">
				<image src="D:\DeskTop\contest_app\uni-app-contest-message-2\static\images\race1.png" alt="" class="img-img"/>
				<text>学科类竞赛</text>		
			</navigator>
			<navigator class="img-nav">
				<image src="D:\DeskTop\contest_app\uni-app-contest-message-2\static\images\race2.png" alt="" class="img-img"/>
				<text>体育类竞赛</text>
						
			</navigator>
			<navigator class="img-nav">
				<image src="D:\DeskTop\contest_app\uni-app-contest-message-2\static\images\race3.png" alt="" class="img-img"/>
				<text>艺术类竞赛</text>					
			</navigator>
			<navigator class="img-nav">
				<image src="D:\DeskTop\contest_app\uni-app-contest-message-2\static\images\race4.png" alt="" class="img-img"/>
				<text>技能竞赛</text>			
			</navigator>
			<navigator class="img-nav">
				<image src="D:\DeskTop\contest_app\uni-app-contest-message-2\static\images\race5.png" alt="" class="img-img"/>
				<text>创新创业竞赛</text>				
			</navigator>
			<navigator class="img-nav1">
				<image src="D:\DeskTop\contest_app\uni-app-contest-message-2\static\images\race6.png" alt="" class="img-img"/>
				<text>其他竞赛</text>
			</navigator>
		</view>
	

	</view>
</template>

<script>
	export default {
	  data() {
	    return {
	    };
	  }
	};

</script>

<style>
	
	/* 轮播图区域 */
	.uni-margin-wrap{
		width: 100%;
		padding-left: 50rpx;
	}

	/* 图标字体 */
	.icon-content{
		display: flex;
		margin-top: 30rpx;
		padding: 10rpx 10rpx;
		background-color: #efefef;
		
	}
	.icon-img{
		margin-left: 50rpx;
	}
	.icon-text{
		margin-left: 5rpx;
		font-size: 32rpx;
	}
	
	/* 竞赛种类区域 */
	.img-content{
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
		margin: 20rpx 20rpx;
	}
	.img-nav{
		display: column;
		margin: 20rpx;
	}
	.img-nav1{
		display: column;
		margin: 20rpx -10rpx;
	}
	.img-img{
		width: 100rpx;
		height: 100rpx;
		margin-left: 20rpx;
	}
	.img-nav text {
		display: block;
		margin-left: 10rpx;
		font-size: 26rpx;
	}
	.img-nav1 text {
		display: block;
		margin-left: 20rpx;
		font-size: 26rpx;
	}
</style>
