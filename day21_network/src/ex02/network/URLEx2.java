package ex02.network;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {
	public static void main(String[] args) 
			throws MalformedURLException,IOException {
		
//		URL url = new URL("https://www.google.com/search?q=kim+yona&hl=ko&ei=NhJGZMr2B6a32roP656hiAU&ved=0ahUKEwjK6Ymb48H-AhWmm1YBHWtPCFEQ4dUDCA8&uact=5&oq=kim+yona&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIHCC4QgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjISCC4QgAQQChDcBBDeBBDfBBgBOgoIABBHENYEELADSgQIQRgAUI4DWI4DYMYFaAFwAXgAgAF6iAF6kgEDMC4xmAEAoAEByAEKwAEB2gEGCAEQARgU&sclient=gws-wiz-serp");
		URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=kimyuna");
		https://www.google.com/
//			search?
//					q=kim+yona  // 속성 = 값 & 속성=값2 & 속성 = 값3 ,...
//					&hl=ko
//					&ei=NhJGZMr2B6a32roP656hiAU&ved=0ahUKEwjK6Ymb48H-AhWmm1YBHWtPCFEQ4dUDCA8
//					&uact=5
//					&oq=kim+yona
//					&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIHCC4QgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjISCC4QgAQQChDcBBDeBBDfBBgBOgoIABBHENYEELADSgQIQRgAUI4DWI4DYMYFaAFwAXgAgAF6iAF6kgEDMC4xmAEAoAEByAEKwAEB2gEGCAEQARgU&sclient=gws-wiz-serp
		
		// URL이 갖고 있는 함수들 사용
		System.out.println("프로토콜 : "+url.getProtocol());
		System.out.println("호스트와 포트 : "+url.getAuthority());
		System.out.println("호스트 : "+url.getHost());
		System.out.println("포트 : "+url.getPort());
		System.out.println("경로 : "+url.getPath());
		System.out.println("질의 : "+url.getQuery());
		System.out.println("파일명 : "+url.getRef());
	}
}
