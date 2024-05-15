class Utils {
	constructor(){
		this.baseUrl = 'http://159.75.169.224:7300/pz'
	}
	getUserInfo() {
		uni.login({
			success: res => {
				console.log(res)
				this.request({
					url:'/auth/wxLogin',
					data: {
						code : res.code
					},
					success: res => {
						console.log(res,'res')
					} 
				})
			}
		})
	}
	request(option = {
		showLoadding: false,
	}){
		// 判断url是否存在
		if(!option.url){
			return false
		}
		if (option.showLoading) {
			this.showLoading()
		}
		// /auth/wxLogin
		uni.request({
			url: this.baseUrl + option.url,
			data: option.data ? option.data : {},
			header: option.header ? option.header : {},
			method: option.method ? option.method : 'GET' ,
			success:(response) => {
				uni.hideLoading()
				// 后端返回数据是异常的
				if (response.data.code != 10000 ) {
					//将失败的结果返回出去
					if(option.fail && typeof option.fail == 'funtion' ){
						option.fail(response)
					}
				} else {
					// 将成功的结果返回
					if (option.success && typeof option.success == 'function'){
						option.success(response.data )
					}
				}
			},
			fail: response => {
				uni.hideLoading()
				console.log(response )
			}
		})
	}
	//创建加载的loading效果
	showLoading(){
		const isShowLoading = uni.getStorageSync('isShowLoading')
		if ( isShowLoading ) {
			uni.hideLoading()
			uni.setStorageSync('isShowLoading', false)
		}
		uni.showLoading({
			title: '加载中......',
			complete: function () {
				uni.setStorageSync('isShoeLoading', true)
			},
			fail: function () {
				uni.setStorageSync('isShoeLoading',false)
			}
		})
	}
}

export default new Utils()