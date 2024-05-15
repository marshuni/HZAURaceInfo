<template>
	<view>
		<!-- 根据登录状态显示不同内容 -->
		<view v-if="!isLoggedIn">
		  <!-- 未登录时显示登录按钮 -->
		  <button @click="login">登录</button>
		</view>
		<view v-else>
			<view class="my_content">
				<view class="my_top_content">
					<image :src="my_image" mode="aspectFill" class="my_image"></image>
					<view class="my_top_text">
						<text class="my_name">昵称：{{my_name}}</text>
						<text class="my_id">ID：{{my_id}}</text>
						<text class="my_college">学院：{{my_college}}</text>
					</view>
				</view>
		  	
				<view class="my_middle_content">
					<navigator class="my_love" url="/pages/user_love/user_love">
						<uni-icons custom-prefix="iconfont" type="icon-fav" size="20" class="icon-img" >
							<text class="icon-text" >我的收藏</text>
						</uni-icons>
					</navigator>
					<navigator 	class="my_evaluate" 
								url="/pages/user_evaluate/user_evaluate" 
								open-type="navigate"
								animation-duration="100">
						<uni-icons custom-prefix="iconfont" type="icon-calendar" size="20" class="icon-img" >
							<text class="icon-text" >我的评价</text>
						</uni-icons>
					</navigator>
					<navigator 	class="my_clock" 
								url="/pages/user_clock/user_clock"
								open-type="navigate"
								animation-duration="100">
						<uni-icons custom-prefix="iconfont" type="icon-clock" size="20" class="icon-img" >
							<text class="icon-text" >日程提醒</text>
						</uni-icons>
					</navigator>
				</view>
			</view>
		</view>
	</view>
</template>

<script>
	// import { ref, reactive, computed,defineComponent } from 'vue'
	// const my_image = ref("https://wx4.sinaimg.cn/mw690/684eb29aly1hp82x60pbmj20yp235e81.jpg")
	// const my_name = ref("拽姐")
	// const my_id = ref("2022317220421")
	// const my_college = ref("信息学院")
	
	export default {
	  data() {
	    return {
			my_image : '',
			my_name : '',
			my_id : '',
			my_college : '' ,
			isLoggedIn: false, // 登录状态，默认未登录
			username: '' // 登录用户名
	    };
	  },
	  methods: {
	    login() {
	      // 模拟登录操作，通常会调用后端接口进行验证
	      // 假设登录成功，设置登录状态为 true，并设置用户名
	      this.isLoggedIn = true;
	      this.username = 'User'; // 假设这里是登录用户的用户名
		  this.my_image ='https://wx4.sinaimg.cn/mw690/684eb29aly1hp82x60pbmj20yp235e81.jpg'
		  this.my_name = '拽姐'
		  this.my_id = '2022317220421'
		  this.my_college = '信息学院'
	    }
	  }
	};
	
</script>

<style>
	.my_content{
		height: 1500rpx;
	}
	.my_top_content{
		margin-top: 20rpx;
		/* background-color: aliceblue; */
		padding: 20rpx 50rpx 40rpx;
	}
	
	.my_top_text{
		margin-top: -170rpx;
		margin-left: 260rpx;
	}
	.my_image{
		display: block;
		width: 200rpx;
		height: 200rpx;
		border-radius: 50%;
		margin-right: 50rpx;
	}
	.my_top_content text
	{
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
		margin-top: 10rpx;
	}
	
	.my_middle_content{
		margin-top: 100rpx;
	}
	.my_middle_content navigator{
		margin-top: 10rpx;
		padding: 10rpx;
		/* background-color: #eaf0f5;	 */
		}
	.icon-img text{
		margin-left: 20rpx;
	}
	
</style>
