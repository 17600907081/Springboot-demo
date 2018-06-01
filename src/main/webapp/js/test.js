var i = 0;

$(function(){
	
	int i = 0;
	int intArray [] = new int[]{20,21,22,23,24,25};
	for (int j = 0; j < intArray.length; j++) {
		if (j==i) {
			System.err.println(intArray[j]);
			try {
				totaladd(); //定时时触发的函数
				setInterval(totaladd,3000);//设置定时1000=1秒d.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	
});
function totaladd(){
	i++;
}