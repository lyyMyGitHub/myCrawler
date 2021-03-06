package com.xyzj.crawler.spidertask.example.dorule;

import com.xyzj.crawler.framework.entity.Param;
import com.xyzj.crawler.framework.factory.SpiderRuleFactory;
import com.xyzj.crawler.framework.defaults.DefaultM3u8SpiderRule;
import com.xyzj.crawler.framework.interfaces.ISpiderRule;
import java.util.HashMap;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;

/**
 * @author lyy
 * @since 2018-11-25 18:57
 */
@Slf4j
public class DoRule51Cto {

    public static void main(String[] args) {

        //文件保存地址
        String fileName = "/Users/liuyangyang/Downloads/" + UUID.randomUUID() + ".mp4";
        //m3u8路径
        String httpUrl = "http://edu.51cto.com//center/player/play/m3u8?lesson_id=202687&id=190921&dp=general&type=course&lesson_type=course";
        //m3u8地址请求头
        HashMap<String, String> headerInfosMap = new HashMap<>(16);
        headerInfosMap.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36");
        //模拟登陆必须内容
        headerInfosMap.put("Cookie", "acw_tc=276aedd215431325834491762e1d45b45d7060c7dec9c77742b0f52b0eeb32; _csrf=91d7e25d637d436027e7819c6d5e9f7fb1efc29328e1b286a12c71c562b3c9ffa%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22%87y%F2%9EN%D2%C1%F0%B6%DD%00%2Bi_%ABS%87C%18%AB%0A%EE%D1_%E1%D4e%09%E9%DB%97%A3%22%3B%7D; looyu_id=2ca1e50b89c720f6c644646887121255_20000923%3A1; 51ctologToken=8eee7adfa2139ad0eb3881e882b9350a; _ourplusFirstTime=118-11-25-15-56-25; _ga=GA1.2.1084733366.1543132586; _gid=GA1.2.1681094532.1543132586; _t99_chat=1; www51cto=70F4649BA2D0E3E01B91BF4FB0771B95EGZG; pub_cookietime=0; bdshare_firstime=1543132639813; 13240332=2018/11/25; EDUACCOUNT=59bc35e120ecde375071702d5a847a51a5e15544efa309f8d5b1da3e62ce7e56a%3A2%3A%7Bi%3A0%3Bs%3A10%3A%22EDUACCOUNT%22%3Bi%3A1%3Bs%3A32%3A%2295cd024928664c2dbef35fb538aeca8c%22%3B%7D; _ourplusReturnCount=5; _ourplusReturnTime=118-11-25-16-1-48; __utma=1.1084733366.1543132586.1543132909.1543132909.1; __utmc=1; __utmz=1.1543132909.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); Hm_lvt_f77ea1ecd95cb2a1bc65cbcb3aaba7d4=1543132909; Hm_lpvt_f77ea1ecd95cb2a1bc65cbcb3aaba7d4=1543132909; playTime202687=1337.723899; playTime202689=94; playDEF=hd; _51ctologStr=data%3D%257Bvisitorid%3A%25228eee7adfa2139ad0eb3881e882b9350a%2522%2CuserAagent%3A%2522Mozilla/5.0%2520%28Macintosh%3B%2520Intel%2520Mac%2520OS%2520X%252010_13_2%29%2520AppleWebKit/537.36%2520%28KHTML%2520%2520like%2520Gecko%29%2520Chrome/70.0.3538.102%2520Safari/537.36%2522%2Ctoken%3A%25228eee7adfa2139ad0eb3881e882b9350a%2522%2Cuid%3A%2522%2522%2Cuuid%3A%252254f10ca8-1a3c-c5dd-t903-o22928bc36ce%2522%2Ctype%3A%2522close%2522%2Cdom%3A%2522%2522%2CdomId%3A%2522%2522%2CdomInnerTxt%3A%2522%2522%2Cprice%3A%2522%2522%2Cstudents_count%3A%2522%2522%2Cfavourite%3A%2522%2522%2Cvote%3A%2522%2522%2Cscrolling%3A%25220%2525%2522%2Cscreensize%3A%25221280X800%2522%2Curl%3A%2522http%25253A%25252F%25252Fhome.51cto.com%25252Findex%25252F%25253Freback%25253Dhttp%2525253A%2525252F%2525252Fedu.51cto.com%2525252Fcenter%2525252Fuser%2525252Findex%2525252Flogin-success%2525253Fsign%2525253D1e4dAVQIA1FRBAEJAQFUVFVUWgEEC1tRUwECVgpYEE0UXxweAVxGT1QFUk1eS1ZZWUsABw9MBhRMAFgRQEMBFggAQEILVhwID1BUQQ4MUQsGVFFUVwBSA1cH%25252526client%2525253Dweb%2522%2Cref%3A%2522http%25253A%25252F%25252Fhome.51cto.com%25252Findex%25252F%25253Freback%25253Dhttp%2525253A%2525252F%2525252Fedu.51cto.com%2525252Fcenter%2525252Fuser%2525252Findex%2525252Flogin-success%2525253Fsign%2525253D1e4dAVQIA1FRBAEJAQFUVFVUWgEEC1tRUwECVgpYEE0UXxweAVxGT1QFUk1eS1ZZWUsABw9MBhRMAFgRQEMBFggAQEILVhwID1BUQQ4MUQsGVFFUVwBSA1cH%25252526client%2525253Dweb%2522%2Cfrom%3A%2522home%2522%2Cduration%3A%252221180%2522%2Ctime%3A%25221543139532503%2522%257D; pub_sauth1=tKGEuF1dD1Q6BQEDVwlVBwY6BVFSAQQCW1YEVg; pub_sauth2=0c84c9bfca688ef4b37d29441f5474ef; PHPSESSID=22c8d16uam5ugjdtjnc4or0pm7; logserveruid=13240332; Hm_lvt_8c8abdb71d78d33dfdb885e0bc71dae0=1543132627,1543139006,1543139032,1543139535; Cto_lvt_=1543132627,1543139006,1543139032,1543139535; _gat_gtag_UA_118863081_1=1; _51ctologStr=data%3D%257Bvisitorid%3A%25228eee7adfa2139ad0eb3881e882b9350a%2522%2CuserAagent%3A%2522Mozilla/5.0%2520%28Macintosh%3B%2520Intel%2520Mac%2520OS%2520X%252010_13_2%29%2520AppleWebKit/537.36%2520%28KHTML%2520%2520like%2520Gecko%29%2520Chrome/70.0.3538.102%2520Safari/537.36%2522%2Ctoken%3A%25228eee7adfa2139ad0eb3881e882b9350a%2522%2Cuid%3A%252213240332%2522%2Cuuid%3A%252258e302b0-1b4c-c155-t443-o6e8309fd1b4%2522%2Ctype%3A%2522close%2522%2Cdom%3A%2522%2522%2CdomId%3A%2522%2522%2CdomInnerTxt%3A%2522%2522%2Cprice%3A%2522%2522%2Cstudents_count%3A%2522%2522%2Cfavourite%3A%2522%2522%2Cvote%3A%2522%2522%2Cscrolling%3A%25220%2525%2522%2Cscreensize%3A%25221280X800%2522%2Curl%3A%2522http%25253A%25252F%25252Fedu.51cto.com%25252Fcenter%25252Fcourse%25252Flesson%25252Findex%25253Fid%25253D202668%2522%2Cref%3A%2522http%25253A%25252F%25252Fhome.51cto.com%25252Findex%25252F%25253Freback%25253Dhttp%2525253A%2525252F%2525252Fedu.51cto.com%2525252Fcenter%2525252Fuser%2525252Findex%2525252Flogin-success%2525253Fsign%2525253D1e4dAVQIA1FRBAEJAQFUVFVUWgEEC1tRUwECVgpYEE0UXxweAVxGT1QFUk1eS1ZZWUsABw9MBhRMAFgRQEMBFggAQEILVhwID1BUQQ4MUQsGVFFUVwBSA1cH%25252526client%2525253Dweb%2522%2Cfrom%3A%2522edu%2522%2Cduration%3A%25222499%2522%2Ctime%3A%25221543139537068%2522%257D; playTime202668=58; Hm_lpvt_8c8abdb71d78d33dfdb885e0bc71dae0=1543139538; Cto_lpvt_=1543139538; playTime202662=536.436775");
        headerInfosMap.put("Accept", "*/*");
        headerInfosMap.put("Accept-Encoding", "gzip, deflate");
        headerInfosMap.put("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8");
        headerInfosMap.put("Cache-Control", "no-cache");
        headerInfosMap.put("Connection", "keep-alive");
        headerInfosMap.put("Host", "edu.51cto.com");
        headerInfosMap.put("Pragma", "no-cache");
        headerInfosMap.put("Referer", "http://edu.51cto.com/center/course/lesson/index?id=202687");


        //工厂取得M3u8SpiderRule实例
        ISpiderRule spiderRule = new SpiderRuleFactory(new DefaultM3u8SpiderRule()).getInstance();

        //封装参数
        Param param = new Param();
        param.setWebUrl(httpUrl);
        param.setFileFullName(fileName);
        param.setHeaderInfos(headerInfosMap);

        //走你
        spiderRule.runSpider(param,spiderRule);

    }
}
