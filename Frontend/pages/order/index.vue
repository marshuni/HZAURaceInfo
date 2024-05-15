<template>
	<view>
		<view class="select-content">
			<uni-icons class="select-icon"  custom-prefix="iconfont" type="icon-RectangleCopy" size="20" ></uni-icons>
			<input placeholder="搜索" />
		</view>
		<view class="key-content">
			<view class="select-key">
				<uni-data-select v-model="value1" :localdata="range1" @change="change" placeholder="竞赛等级"></uni-data-select>
			</view>
			<view class="select-key">
				<uni-data-select v-model="value2" :localdata="range2" @change="change" placeholder="竞赛种类"></uni-data-select>
			</view>
		</view>

	</view>
	
</template>

<script >
	
	export default {
		data() {
			return {
				value1: -1,
				value2: -1,
				range1: [
					{ "value": 0, "text": "院级"},
					{ "value": 1, "text": "校级"},
					{ "value": 2, "text": "省级"},
					{ "value": 3, "text": "国家级"},
				],
				range2: [
					{ "value": 0, "text": "学科类"},
					{ "value": 1, "text": "体育类"},
					{ "value": 2, "text": "艺术类"},
					{ "value": 3, "text": "技能类"},
					{ "value": 4, "text": "创新创业类"},
					{ "value": 5, "text": "其他"},
					
				]
			}
		},
		methods: {
			change(e) {
				console.log('e:', e);
			}
		}
	}
	
	
</script>

<style lang="scss">
	.select-content{
		display: flex;
		flex-wrap: wrap;
		background-color: #efefef;
		border-radius: 30rpx;
		margin:20rpx;
		padding: 10rpx 20rpx;
	}
	.select-icon{
		margin-top: 5rpx;
	}
	.select-content input{
		margin-left: 10rpx;
	}
	
	.text {
		font-size: 12px;
		color: #666;
		margin-top: 5px;
	}
	
	.key-content{
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
		margin-left: 20rpx;
	}
	
	.select-key {
		width: 44%;
		padding-left: 10px;
		padding-right: 10px;
	}
	
	
	
	
</style>
