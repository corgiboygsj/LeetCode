package test.test;

import java.io.Serializable;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;

/**
 * @author guoshoujing
 * @create 2020-06-24 8:23 上午
 */
public class Test implements Serializable {
    public static void main(String[] args) throws Exception {
//        Object obj = new Object();
//        ReferenceQueue<Object> queue = new ReferenceQueue<>();
//        PhantomReference<Object> reference = new PhantomReference<>(obj, queue);
//        Object o = queue.remove(1000L);
//        System.out.println(o);
//        obj = null;
//        o = null;
//        System.gc();
//        Thread.sleep(2000);
//        Object o2 = queue.remove(1000L);
//        System.out.println(o2);

//        String name = new String("guo");
//        name.intern();
//        String name2 = "guo";
//        System.out.println(name == name2);

        c();

    }

    public static void e(){
        String json = "{\"code\":0,\"msg\":\"成功\",\"desc\":\"成功\",\"trace\":null,\"data\":[{\"id\":377,\"type\":1,\"name\":\"语言积累与运用\",\"childs\":[{\"id\":378,\"type\":1,\"name\":\"字音\",\"childs\":[{\"id\":201465,\"type\":2,\"name\":\"字音辨析\",\"childs\":[{\"id\":204488,\"type\":3,\"name\":\"形近字误读\",\"childs\":[]},{\"id\":204489,\"type\":3,\"name\":\"习惯性误读\",\"childs\":[]},{\"id\":204490,\"type\":3,\"name\":\"多音字误读\",\"childs\":[]}]}]},{\"id\":379,\"type\":1,\"name\":\"汉字\",\"childs\":[{\"id\":380,\"type\":1,\"name\":\"汉字的书写\",\"childs\":[{\"id\":201469,\"type\":2,\"name\":\"书写要求\",\"childs\":[{\"id\":204506,\"type\":3,\"name\":\"规范、端正、整洁\",\"childs\":[]}]},{\"id\":201470,\"type\":2,\"name\":\"汉字的笔画笔顺\",\"childs\":[{\"id\":204507,\"type\":3,\"name\":\"汉字的笔画\",\"childs\":[]},{\"id\":204508,\"type\":3,\"name\":\"汉字的笔顺\",\"childs\":[]}]},{\"id\":201471,\"type\":2,\"name\":\"字谜\",\"childs\":[{\"id\":204509,\"type\":3,\"name\":\"字谜\",\"childs\":[]}]},{\"id\":201472,\"type\":2,\"name\":\"汉字的间架结构\",\"childs\":[{\"id\":204510,\"type\":3,\"name\":\"偏旁部首\",\"childs\":[]},{\"id\":204511,\"type\":3,\"name\":\"间架\",\"childs\":[]}]}]},{\"id\":201466,\"type\":2,\"name\":\"字形辨别\",\"childs\":[{\"id\":204491,\"type\":3,\"name\":\"易错易混字\",\"childs\":[]}]},{\"id\":201467,\"type\":2,\"name\":\"汉字起源与形体演变\",\"childs\":[{\"id\":204492,\"type\":3,\"name\":\"甲骨文\",\"childs\":[]},{\"id\":204493,\"type\":3,\"name\":\"金文\",\"childs\":[]},{\"id\":204494,\"type\":3,\"name\":\"小篆\",\"childs\":[]},{\"id\":204495,\"type\":3,\"name\":\"隶书\",\"childs\":[]},{\"id\":204496,\"type\":3,\"name\":\"楷书\",\"childs\":[]},{\"id\":204497,\"type\":3,\"name\":\"草书\",\"childs\":[]},{\"id\":204498,\"type\":3,\"name\":\"行书\",\"childs\":[]},{\"id\":204499,\"type\":3,\"name\":\"其它字体\",\"childs\":[]}]},{\"id\":201468,\"type\":2,\"name\":\"六书\",\"childs\":[{\"id\":204500,\"type\":3,\"name\":\"象形\",\"childs\":[]},{\"id\":204501,\"type\":3,\"name\":\"指事\",\"childs\":[]},{\"id\":204502,\"type\":3,\"name\":\"会意\",\"childs\":[]},{\"id\":204503,\"type\":3,\"name\":\"形声\",\"childs\":[]},{\"id\":204504,\"type\":3,\"name\":\"转注\",\"childs\":[]},{\"id\":204505,\"type\":3,\"name\":\"假借\",\"childs\":[]}]}]},{\"id\":381,\"type\":1,\"name\":\"词语\",\"childs\":[{\"id\":382,\"type\":1,\"name\":\"成语\",\"childs\":[{\"id\":201475,\"type\":2,\"name\":\"成语运用\",\"childs\":[{\"id\":204515,\"type\":3,\"name\":\"望文生义\",\"childs\":[]},{\"id\":204516,\"type\":3,\"name\":\"搭配不当-成语\",\"childs\":[]},{\"id\":204517,\"type\":3,\"name\":\"褒贬颠倒\",\"childs\":[]},{\"id\":204518,\"type\":3,\"name\":\"误用典故\",\"childs\":[]},{\"id\":204519,\"type\":3,\"name\":\"谦敬误用\",\"childs\":[]},{\"id\":204520,\"type\":3,\"name\":\"对象误用\",\"childs\":[]},{\"id\":204521,\"type\":3,\"name\":\"重复啰嗦\",\"childs\":[]},{\"id\":204522,\"type\":3,\"name\":\"语境不合\",\"childs\":[]}]},{\"id\":201476,\"type\":2,\"name\":\"成语积累\",\"childs\":[{\"id\":204523,\"type\":3,\"name\":\"常考成语\",\"childs\":[]},{\"id\":204524,\"type\":3,\"name\":\"成语来源\",\"childs\":[]}]}]},{\"id\":201473,\"type\":2,\"name\":\"词语释义\",\"childs\":[{\"id\":204512,\"type\":3,\"name\":\"词语释义\",\"childs\":[]},{\"id\":204513,\"type\":3,\"name\":\"释义辨析\",\"childs\":[]}]},{\"id\":201474,\"type\":2,\"name\":\"词语辨析\",\"childs\":[{\"id\":204514,\"type\":3,\"name\":\"近义词辨析\",\"childs\":[]}]},{\"id\":201477,\"type\":2,\"name\":\"熟语的积累和运用\",\"childs\":[{\"id\":204525,\"type\":3,\"name\":\"惯用语的积累和运用\",\"childs\":[]},{\"id\":204526,\"type\":3,\"name\":\"谚语的积累和运用\",\"childs\":[]},{\"id\":204527,\"type\":3,\"name\":\"格言的积累和运用\",\"childs\":[]},{\"id\":204528,\"type\":3,\"name\":\"歇后语的积累与运用\",\"childs\":[]}]},{\"id\":201478,\"type\":2,\"name\":\"关联词语的运用\",\"childs\":[{\"id\":204529,\"type\":3,\"name\":\"并列关系\",\"childs\":[]},{\"id\":204537,\"type\":3,\"name\":\"目的关系\",\"childs\":[]},{\"id\":204536,\"type\":3,\"name\":\"因果关系\",\"childs\":[]},{\"id\":204535,\"type\":3,\"name\":\"假设关系\",\"childs\":[]},{\"id\":204534,\"type\":3,\"name\":\"条件关系\",\"childs\":[]},{\"id\":204533,\"type\":3,\"name\":\"转折关系\",\"childs\":[]},{\"id\":204532,\"type\":3,\"name\":\"递进关系\",\"childs\":[]},{\"id\":204531,\"type\":3,\"name\":\"选择关系\",\"childs\":[]},{\"id\":204530,\"type\":3,\"name\":\"承接关系\",\"childs\":[]},{\"id\":204538,\"type\":3,\"name\":\"多重关系\",\"childs\":[]}]},{\"id\":201479,\"type\":2,\"name\":\"词性\",\"childs\":[{\"id\":204539,\"type\":3,\"name\":\"词性\",\"childs\":[]}]},{\"id\":201480,\"type\":2,\"name\":\"短语类型\",\"childs\":[{\"id\":204540,\"type\":3,\"name\":\"短语类型\",\"childs\":[]}]}]},{\"id\":383,\"type\":1,\"name\":\"句子\",\"childs\":[{\"id\":384,\"type\":1,\"name\":\"句子成分\",\"childs\":[{\"id\":201481,\"type\":2,\"name\":\"句子成分\",\"childs\":[{\"id\":204541,\"type\":3,\"name\":\"句子成分\",\"childs\":[]}]},{\"id\":201482,\"type\":2,\"name\":\"划分主干\",\"childs\":[{\"id\":204542,\"type\":3,\"name\":\"划分主干\",\"childs\":[]}]}]},{\"id\":385,\"type\":1,\"name\":\"病句的辨析和修改\",\"childs\":[{\"id\":201483,\"type\":2,\"name\":\"成分残缺\",\"childs\":[{\"id\":204543,\"type\":3,\"name\":\"成分残缺\",\"childs\":[]}]},{\"id\":201484,\"type\":2,\"name\":\"成分赘余\",\"childs\":[{\"id\":204544,\"type\":3,\"name\":\"成分赘余\",\"childs\":[]}]},{\"id\":201485,\"type\":2,\"name\":\"语序不当\",\"childs\":[{\"id\":204545,\"type\":3,\"name\":\"语序不当\",\"childs\":[]}]},{\"id\":201486,\"type\":2,\"name\":\"搭配不当\",\"childs\":[{\"id\":204546,\"type\":3,\"name\":\"搭配不当\",\"childs\":[]}]},{\"id\":201487,\"type\":2,\"name\":\"不合逻辑\",\"childs\":[{\"id\":204547,\"type\":3,\"name\":\"不合逻辑\",\"childs\":[]}]},{\"id\":201488,\"type\":2,\"name\":\"结构混乱\",\"childs\":[{\"id\":204548,\"type\":3,\"name\":\"结构混乱\",\"childs\":[]}]},{\"id\":201489,\"type\":2,\"name\":\"表意不明\",\"childs\":[{\"id\":204549,\"type\":3,\"name\":\"表意不明\",\"childs\":[]}]}]},{\"id\":386,\"type\":1,\"name\":\"句子的语序与衔接\",\"childs\":[{\"id\":201490,\"type\":2,\"name\":\"句子的排序\",\"childs\":[{\"id\":204550,\"type\":3,\"name\":\"句子的排序\",\"childs\":[]}]},{\"id\":201491,\"type\":2,\"name\":\"句子的连贯与衔接\",\"childs\":[{\"id\":204551,\"type\":3,\"name\":\"句子的连贯与衔接\",\"childs\":[]}]}]},{\"id\":201492,\"type\":2,\"name\":\"句式\",\"childs\":[{\"id\":204552,\"type\":3,\"name\":\"句式\",\"childs\":[]}]}]},{\"id\":387,\"type\":1,\"name\":\"标点符号\",\"childs\":[{\"id\":201493,\"type\":2,\"name\":\"引号\",\"childs\":[{\"id\":204553,\"type\":3,\"name\":\"引号\",\"childs\":[]}]},{\"id\":201503,\"type\":2,\"name\":\"逗号\",\"childs\":[{\"id\":204563,\"type\":3,\"name\":\"逗号\",\"childs\":[]}]},{\"id\":201502,\"type\":2,\"name\":\"分号\",\"childs\":[{\"id\":204562,\"type\":3,\"name\":\"分号\",\"childs\":[]}]},{\"id\":201501,\"type\":2,\"name\":\"冒号\",\"childs\":[{\"id\":204561,\"type\":3,\"name\":\"冒号\",\"childs\":[]}]},{\"id\":201500,\"type\":2,\"name\":\"叹号\",\"childs\":[{\"id\":204560,\"type\":3,\"name\":\"叹号\",\"childs\":[]}]},{\"id\":201499,\"type\":2,\"name\":\"问号\",\"childs\":[{\"id\":204559,\"type\":3,\"name\":\"问号\",\"childs\":[]}]},{\"id\":201498,\"type\":2,\"name\":\"句号\",\"childs\":[{\"id\":204558,\"type\":3,\"name\":\"句号\",\"childs\":[]}]},{\"id\":201497,\"type\":2,\"name\":\"括号\",\"childs\":[{\"id\":204557,\"type\":3,\"name\":\"括号\",\"childs\":[]}]},{\"id\":201496,\"type\":2,\"name\":\"书名号\",\"childs\":[{\"id\":204556,\"type\":3,\"name\":\"书名号\",\"childs\":[]}]},{\"id\":201495,\"type\":2,\"name\":\"省略号\",\"childs\":[{\"id\":204555,\"type\":3,\"name\":\"省略号\",\"childs\":[]}]},{\"id\":201494,\"type\":2,\"name\":\"破折号\",\"childs\":[{\"id\":204554,\"type\":3,\"name\":\"破折号\",\"childs\":[]}]},{\"id\":201504,\"type\":2,\"name\":\"顿号\",\"childs\":[{\"id\":204564,\"type\":3,\"name\":\"顿号\",\"childs\":[]}]}]},{\"id\":388,\"type\":1,\"name\":\"修辞\",\"childs\":[{\"id\":201505,\"type\":2,\"name\":\"比喻\",\"childs\":[{\"id\":204565,\"type\":3,\"name\":\"比喻\",\"childs\":[]}]},{\"id\":201519,\"type\":2,\"name\":\"通感\",\"childs\":[{\"id\":204579,\"type\":3,\"name\":\"通感\",\"childs\":[]}]},{\"id\":201518,\"type\":2,\"name\":\"顶针\",\"childs\":[{\"id\":204578,\"type\":3,\"name\":\"顶针\",\"childs\":[]}]},{\"id\":201517,\"type\":2,\"name\":\"互文\",\"childs\":[{\"id\":204577,\"type\":3,\"name\":\"互文\",\"childs\":[]}]},{\"id\":201516,\"type\":2,\"name\":\"引用\",\"childs\":[{\"id\":204576,\"type\":3,\"name\":\"引用\",\"childs\":[]}]},{\"id\":201515,\"type\":2,\"name\":\"反语\",\"childs\":[{\"id\":204575,\"type\":3,\"name\":\"反语\",\"childs\":[]}]},{\"id\":201514,\"type\":2,\"name\":\"双关\",\"childs\":[{\"id\":204574,\"type\":3,\"name\":\"双关\",\"childs\":[]}]},{\"id\":201513,\"type\":2,\"name\":\"借代\",\"childs\":[{\"id\":204573,\"type\":3,\"name\":\"借代\",\"childs\":[]}]},{\"id\":201512,\"type\":2,\"name\":\"设问\",\"childs\":[{\"id\":204572,\"type\":3,\"name\":\"设问\",\"childs\":[]}]},{\"id\":201511,\"type\":2,\"name\":\"反问\",\"childs\":[{\"id\":204571,\"type\":3,\"name\":\"反问\",\"childs\":[]}]},{\"id\":201510,\"type\":2,\"name\":\"对偶\",\"childs\":[{\"id\":204570,\"type\":3,\"name\":\"对偶\",\"childs\":[]}]},{\"id\":201509,\"type\":2,\"name\":\"反复\",\"childs\":[{\"id\":204569,\"type\":3,\"name\":\"反复\",\"childs\":[]}]},{\"id\":201508,\"type\":2,\"name\":\"排比\",\"childs\":[{\"id\":204568,\"type\":3,\"name\":\"排比\",\"childs\":[]}]},{\"id\":201507,\"type\":2,\"name\":\"夸张\",\"childs\":[{\"id\":204567,\"type\":3,\"name\":\"夸张\",\"childs\":[]}]},{\"id\":201506,\"type\":2,\"name\":\"比拟\",\"childs\":[{\"id\":204566,\"type\":3,\"name\":\"比拟\",\"childs\":[]}]},{\"id\":201520,\"type\":2,\"name\":\"其他修辞手法\",\"childs\":[{\"id\":204580,\"type\":3,\"name\":\"其他修辞手法\",\"childs\":[]}]}]},{\"id\":389,\"type\":1,\"name\":\"口语交际与语言应用\",\"childs\":[{\"id\":201521,\"type\":2,\"name\":\"口语交际\",\"childs\":[{\"id\":204581,\"type\":3,\"name\":\"简明、连贯、得体\",\"childs\":[]}]},{\"id\":201522,\"type\":2,\"name\":\"句式练习\",\"childs\":[{\"id\":204582,\"type\":3,\"name\":\"扩展语句\",\"childs\":[]},{\"id\":204583,\"type\":3,\"name\":\"压缩语句\",\"childs\":[]},{\"id\":204584,\"type\":3,\"name\":\"变换句式\",\"childs\":[]},{\"id\":204585,\"type\":3,\"name\":\"补写语句\",\"childs\":[]},{\"id\":204586,\"type\":3,\"name\":\"仿写续写\",\"childs\":[]}]},{\"id\":201523,\"type\":2,\"name\":\"综合性学习\",\"childs\":[{\"id\":204587,\"type\":3,\"name\":\"活动参与类\",\"childs\":[]},{\"id\":204588,\"type\":3,\"name\":\"语言创作类\",\"childs\":[]},{\"id\":204589,\"type\":3,\"name\":\"内容概括\",\"childs\":[]},{\"id\":204590,\"type\":3,\"name\":\"图文转换类\",\"childs\":[]},{\"id\":204591,\"type\":3,\"name\":\"材料探究类\",\"childs\":[]},{\"id\":204592,\"type\":3,\"name\":\"广告宣传类\",\"childs\":[]},{\"id\":204593,\"type\":3,\"name\":\"其他题型\",\"childs\":[]}]}]},{\"id\":390,\"type\":1,\"name\":\"中国传统文化\",\"childs\":[{\"id\":201524,\"type\":2,\"name\":\"对联\",\"childs\":[{\"id\":204594,\"type\":3,\"name\":\"对联\",\"childs\":[]}]},{\"id\":201525,\"type\":2,\"name\":\"连环画\",\"childs\":[{\"id\":204595,\"type\":3,\"name\":\"连环画\",\"childs\":[]}]},{\"id\":201526,\"type\":2,\"name\":\"节日\",\"childs\":[{\"id\":204596,\"type\":3,\"name\":\"节日\",\"childs\":[]}]},{\"id\":201527,\"type\":2,\"name\":\"戏剧文化\",\"childs\":[{\"id\":204597,\"type\":3,\"name\":\"戏剧文化\",\"childs\":[]}]},{\"id\":201528,\"type\":2,\"name\":\"书法\",\"childs\":[{\"id\":204598,\"type\":3,\"name\":\"书法\",\"childs\":[]}]},{\"id\":201529,\"type\":2,\"name\":\"节气\",\"childs\":[{\"id\":204599,\"type\":3,\"name\":\"节气\",\"childs\":[]}]},{\"id\":201530,\"type\":2,\"name\":\"其它内容\",\"childs\":[{\"id\":204600,\"type\":3,\"name\":\"其它内容\",\"childs\":[]}]}]}]},{\"id\":391,\"type\":1,\"name\":\"文学常识\",\"childs\":[{\"id\":392,\"type\":1,\"name\":\"文学体裁\",\"childs\":[{\"id\":201531,\"type\":2,\"name\":\"散文\",\"childs\":[{\"id\":204601,\"type\":3,\"name\":\"散文\",\"childs\":[]}]},{\"id\":201532,\"type\":2,\"name\":\"小说\",\"childs\":[{\"id\":204602,\"type\":3,\"name\":\"小说\",\"childs\":[]}]},{\"id\":201533,\"type\":2,\"name\":\"戏剧\",\"childs\":[{\"id\":204603,\"type\":3,\"name\":\"戏剧\",\"childs\":[]}]},{\"id\":201534,\"type\":2,\"name\":\"诗歌\",\"childs\":[{\"id\":204604,\"type\":3,\"name\":\"诗歌\",\"childs\":[]}]},{\"id\":201535,\"type\":2,\"name\":\"史书体例\",\"childs\":[{\"id\":204605,\"type\":3,\"name\":\"史书体例\",\"childs\":[]}]},{\"id\":201536,\"type\":2,\"name\":\"其他体裁\",\"childs\":[{\"id\":204606,\"type\":3,\"name\":\"其他体裁\",\"childs\":[]}]}]},{\"id\":393,\"type\":1,\"name\":\"中国古代作家作品\",\"childs\":[{\"id\":201537,\"type\":2,\"name\":\"先秦\",\"childs\":[{\"id\":204607,\"type\":3,\"name\":\"先秦\",\"childs\":[]}]},{\"id\":201538,\"type\":2,\"name\":\"两汉魏晋南北朝\",\"childs\":[{\"id\":204608,\"type\":3,\"name\":\"两汉魏晋南北朝\",\"childs\":[]}]},{\"id\":201539,\"type\":2,\"name\":\"唐代\",\"childs\":[{\"id\":204609,\"type\":3,\"name\":\"唐代\",\"childs\":[]}]},{\"id\":201540,\"type\":2,\"name\":\"宋\",\"childs\":[{\"id\":204610,\"type\":3,\"name\":\"宋\",\"childs\":[]}]},{\"id\":201541,\"type\":2,\"name\":\"元\",\"childs\":[{\"id\":204611,\"type\":3,\"name\":\"元\",\"childs\":[]}]},{\"id\":201542,\"type\":2,\"name\":\"明\",\"childs\":[{\"id\":204612,\"type\":3,\"name\":\"明\",\"childs\":[]}]},{\"id\":201543,\"type\":2,\"name\":\"清\",\"childs\":[{\"id\":204613,\"type\":3,\"name\":\"清\",\"childs\":[]}]}]},{\"id\":394,\"type\":1,\"name\":\"中国现当代作家\",\"childs\":[{\"id\":395,\"type\":1,\"name\":\"现当代著名作家\",\"childs\":[{\"id\":201544,\"type\":2,\"name\":\"现当代著名作家\",\"childs\":[{\"id\":204614,\"type\":3,\"name\":\"现当代著名作家\",\"childs\":[]}]}]}]},{\"id\":396,\"type\":1,\"name\":\"外国作家作品\",\"childs\":[{\"id\":201545,\"type\":2,\"name\":\"起源\",\"childs\":[{\"id\":204615,\"type\":3,\"name\":\"起源\",\"childs\":[]}]},{\"id\":201546,\"type\":2,\"name\":\"英国\",\"childs\":[{\"id\":204616,\"type\":3,\"name\":\"英国\",\"childs\":[]}]},{\"id\":201547,\"type\":2,\"name\":\"法国\",\"childs\":[{\"id\":204617,\"type\":3,\"name\":\"法国\",\"childs\":[]}]},{\"id\":201548,\"type\":2,\"name\":\"德国\",\"childs\":[{\"id\":204618,\"type\":3,\"name\":\"德国\",\"childs\":[]}]},{\"id\":201549,\"type\":2,\"name\":\"苏俄\",\"childs\":[{\"id\":204619,\"type\":3,\"name\":\"苏俄\",\"childs\":[]}]},{\"id\":201550,\"type\":2,\"name\":\"美国\",\"childs\":[{\"id\":204620,\"type\":3,\"name\":\"美国\",\"childs\":[]}]},{\"id\":201551,\"type\":2,\"name\":\"意大利\",\"childs\":[{\"id\":204621,\"type\":3,\"name\":\"意大利\",\"childs\":[]}]},{\"id\":201552,\"type\":2,\"name\":\"其他国家\",\"childs\":[{\"id\":204622,\"type\":3,\"name\":\"其他国家\",\"childs\":[]}]}]}]},{\"id\":397,\"type\":1,\"name\":\"名著阅读\",\"childs\":[{\"id\":201553,\"type\":2,\"name\":\"文常积累\",\"childs\":[{\"id\":204623,\"type\":3,\"name\":\"作家-名著\",\"childs\":[]},{\"id\":204624,\"type\":3,\"name\":\"作品-名著\",\"childs\":[]},{\"id\":204625,\"type\":3,\"name\":\"国籍-名著\",\"childs\":[]},{\"id\":204626,\"type\":3,\"name\":\"朝代-名著\",\"childs\":[]}]},{\"id\":201554,\"type\":2,\"name\":\"阅读理解\",\"childs\":[{\"id\":204627,\"type\":3,\"name\":\"内容情节-名著\",\"childs\":[]},{\"id\":204628,\"type\":3,\"name\":\"人物形象-名著\",\"childs\":[]},{\"id\":204629,\"type\":3,\"name\":\"主题理解-名著\",\"childs\":[]},{\"id\":204630,\"type\":3,\"name\":\"语言赏析-名著\",\"childs\":[]},{\"id\":204631,\"type\":3,\"name\":\"开放性试题-名著\",\"childs\":[]},{\"id\":204632,\"type\":3,\"name\":\"作用题-名著\",\"childs\":[]}]}]},{\"id\":398,\"type\":1,\"name\":\"古诗文阅读\",\"childs\":[{\"id\":399,\"type\":1,\"name\":\"古诗文名句背诵\",\"childs\":[{\"id\":201555,\"type\":2,\"name\":\"课内古诗文名句\",\"childs\":[{\"id\":204633,\"type\":3,\"name\":\"课内古诗文名句\",\"childs\":[]}]},{\"id\":201556,\"type\":2,\"name\":\"课外古诗文背诵\",\"childs\":[{\"id\":204634,\"type\":3,\"name\":\"课外古诗文背诵\",\"childs\":[]}]},{\"id\":201557,\"type\":2,\"name\":\"古诗文名句默写\",\"childs\":[{\"id\":204635,\"type\":3,\"name\":\"记忆型默写\",\"childs\":[]},{\"id\":204636,\"type\":3,\"name\":\"理解型默写\",\"childs\":[]}]}]},{\"id\":400,\"type\":1,\"name\":\"古典诗歌\",\"childs\":[{\"id\":401,\"type\":1,\"name\":\"古诗词鉴赏知识点\",\"childs\":[{\"id\":201558,\"type\":2,\"name\":\"思想内容-古诗词\",\"childs\":[{\"id\":204637,\"type\":3,\"name\":\"边塞\",\"childs\":[]},{\"id\":204645,\"type\":3,\"name\":\"羁旅\",\"childs\":[]},{\"id\":204644,\"type\":3,\"name\":\"亡国\",\"childs\":[]},{\"id\":204643,\"type\":3,\"name\":\"送别\",\"childs\":[]},{\"id\":204642,\"type\":3,\"name\":\"咏物\",\"childs\":[]},{\"id\":204641,\"type\":3,\"name\":\"咏史\",\"childs\":[]},{\"id\":204640,\"type\":3,\"name\":\"贬谪\",\"childs\":[]},{\"id\":204639,\"type\":3,\"name\":\"闺怨\",\"childs\":[]},{\"id\":204638,\"type\":3,\"name\":\"山水田园\",\"childs\":[]},{\"id\":204646,\"type\":3,\"name\":\"其他主题\",\"childs\":[]}]},{\"id\":201559,\"type\":2,\"name\":\"人物形象-古诗词\",\"childs\":[{\"id\":204647,\"type\":3,\"name\":\"诗人形象\",\"childs\":[]},{\"id\":204648,\"type\":3,\"name\":\"主人公形象\",\"childs\":[]}]},{\"id\":201560,\"type\":2,\"name\":\"意象意境\",\"childs\":[{\"id\":204649,\"type\":3,\"name\":\"意象-古诗词\",\"childs\":[]},{\"id\":204650,\"type\":3,\"name\":\"意境-古诗词\",\"childs\":[]}]},{\"id\":201561,\"type\":2,\"name\":\"炼字\",\"childs\":[{\"id\":204651,\"type\":3,\"name\":\"动词\",\"childs\":[]},{\"id\":204652,\"type\":3,\"name\":\"形容词\",\"childs\":[]},{\"id\":204653,\"type\":3,\"name\":\"其它词\",\"childs\":[]}]},{\"id\":201562,\"type\":2,\"name\":\"语言风格\",\"childs\":[{\"id\":204654,\"type\":3,\"name\":\"语言风格\",\"childs\":[]}]},{\"id\":201563,\"type\":2,\"name\":\"表达方式-古诗词\",\"childs\":[{\"id\":204655,\"type\":3,\"name\":\"表达方式-古诗词\",\"childs\":[]}]},{\"id\":201564,\"type\":2,\"name\":\"表现手法-古诗词\",\"childs\":[{\"id\":204656,\"type\":3,\"name\":\"托物言志-古诗词\",\"childs\":[]},{\"id\":204669,\"type\":3,\"name\":\"衬托-古诗词\",\"childs\":[]},{\"id\":204668,\"type\":3,\"name\":\"象征-古诗词\",\"childs\":[]},{\"id\":204667,\"type\":3,\"name\":\"借古讽今-古诗词\",\"childs\":[]},{\"id\":204666,\"type\":3,\"name\":\"渲染-古诗词\",\"childs\":[]},{\"id\":204665,\"type\":3,\"name\":\"虚实结合-古诗词\",\"childs\":[]},{\"id\":204664,\"type\":3,\"name\":\"烘托-古诗词\",\"childs\":[]},{\"id\":204663,\"type\":3,\"name\":\"动静结合-古诗词\",\"childs\":[]},{\"id\":204662,\"type\":3,\"name\":\"以动衬静-古诗词\",\"childs\":[]},{\"id\":204661,\"type\":3,\"name\":\"借物喻人-古诗词\",\"childs\":[]},{\"id\":204660,\"type\":3,\"name\":\"直抒胸臆-古诗词\",\"childs\":[]},{\"id\":204659,\"type\":3,\"name\":\"叙事抒情-古诗词\",\"childs\":[]},{\"id\":204658,\"type\":3,\"name\":\"借景抒情-古诗词\",\"childs\":[]},{\"id\":204657,\"type\":3,\"name\":\"对比-古诗词\",\"childs\":[]},{\"id\":204670,\"type\":3,\"name\":\"其他手法-古诗词\",\"childs\":[]}]},{\"id\":201565,\"type\":2,\"name\":\"修辞手法-古诗词\",\"childs\":[{\"id\":204671,\"type\":3,\"name\":\"比喻-古诗词\",\"childs\":[]},{\"id\":204681,\"type\":3,\"name\":\"反复-古诗词\",\"childs\":[]},{\"id\":204680,\"type\":3,\"name\":\"设问-古诗词\",\"childs\":[]},{\"id\":204679,\"type\":3,\"name\":\"反问-古诗词\",\"childs\":[]},{\"id\":204678,\"type\":3,\"name\":\"通感-古诗词\",\"childs\":[]},{\"id\":204677,\"type\":3,\"name\":\"双关-古诗词\",\"childs\":[]},{\"id\":204676,\"type\":3,\"name\":\"借代-古诗词\",\"childs\":[]},{\"id\":204675,\"type\":3,\"name\":\"排比-古诗词\",\"childs\":[]},{\"id\":204674,\"type\":3,\"name\":\"对偶-古诗词\",\"childs\":[]},{\"id\":204673,\"type\":3,\"name\":\"夸张-古诗词\",\"childs\":[]},{\"id\":204672,\"type\":3,\"name\":\"比拟-古诗词\",\"childs\":[]},{\"id\":204682,\"type\":3,\"name\":\"其它修辞-古诗词\",\"childs\":[]}]}]}]},{\"id\":402,\"type\":1,\"name\":\"文言文阅读\",\"childs\":[{\"id\":403,\"type\":1,\"name\":\"文言实词\",\"childs\":[{\"id\":201566,\"type\":2,\"name\":\"古今异义\",\"childs\":[{\"id\":204683,\"type\":3,\"name\":\"古今异义\",\"childs\":[]}]},{\"id\":201567,\"type\":2,\"name\":\"一词多义\",\"childs\":[{\"id\":204684,\"type\":3,\"name\":\"一词多义\",\"childs\":[]}]},{\"id\":201568,\"type\":2,\"name\":\"词类活用\",\"childs\":[{\"id\":204685,\"type\":3,\"name\":\"词类活用\",\"childs\":[]}]},{\"id\":201569,\"type\":2,\"name\":\"通假字\",\"childs\":[{\"id\":204686,\"type\":3,\"name\":\"通假字\",\"childs\":[]}]},{\"id\":201570,\"type\":2,\"name\":\"常考实词\",\"childs\":[{\"id\":204687,\"type\":3,\"name\":\"常考实词\",\"childs\":[]}]}]},{\"id\":404,\"type\":1,\"name\":\"文言虚词\",\"childs\":[{\"id\":201571,\"type\":2,\"name\":\"而\",\"childs\":[{\"id\":204688,\"type\":3,\"name\":\"而\",\"childs\":[]}]},{\"id\":201572,\"type\":2,\"name\":\"其\",\"childs\":[{\"id\":204689,\"type\":3,\"name\":\"其\",\"childs\":[]}]},{\"id\":201573,\"type\":2,\"name\":\"然\",\"childs\":[{\"id\":204690,\"type\":3,\"name\":\"然\",\"childs\":[]}]},{\"id\":201574,\"type\":2,\"name\":\"所\",\"childs\":[{\"id\":204691,\"type\":3,\"name\":\"所\",\"childs\":[]}]},{\"id\":201575,\"type\":2,\"name\":\"为\",\"childs\":[{\"id\":204692,\"type\":3,\"name\":\"为\",\"childs\":[]}]},{\"id\":201576,\"type\":2,\"name\":\"之\",\"childs\":[{\"id\":204693,\"type\":3,\"name\":\"之\",\"childs\":[]}]},{\"id\":201577,\"type\":2,\"name\":\"以\",\"childs\":[{\"id\":204694,\"type\":3,\"name\":\"以\",\"childs\":[]}]},{\"id\":201578,\"type\":2,\"name\":\"其他虚词\",\"childs\":[{\"id\":204695,\"type\":3,\"name\":\"其他虚词\",\"childs\":[]}]}]},{\"id\":405,\"type\":1,\"name\":\"文言句式\",\"childs\":[{\"id\":201579,\"type\":2,\"name\":\"判断句\",\"childs\":[{\"id\":204696,\"type\":3,\"name\":\"判断句\",\"childs\":[]}]},{\"id\":201580,\"type\":2,\"name\":\"被动句\",\"childs\":[{\"id\":204697,\"type\":3,\"name\":\"被动句\",\"childs\":[]}]},{\"id\":201581,\"type\":2,\"name\":\"省略句\",\"childs\":[{\"id\":204698,\"type\":3,\"name\":\"省略句\",\"childs\":[]}]},{\"id\":201582,\"type\":2,\"name\":\"倒装句\",\"childs\":[{\"id\":204699,\"type\":3,\"name\":\"倒装句\",\"childs\":[]}]},{\"id\":201583,\"type\":2,\"name\":\"固定句式\",\"childs\":[{\"id\":204700,\"type\":3,\"name\":\"固定句式\",\"childs\":[]}]}]},{\"id\":406,\"type\":1,\"name\":\"朗读节奏\",\"childs\":[{\"id\":201584,\"type\":2,\"name\":\"朗读节奏\",\"childs\":[{\"id\":204701,\"type\":3,\"name\":\"朗读节奏\",\"childs\":[]}]}]},{\"id\":407,\"type\":1,\"name\":\"文言断句\",\"childs\":[{\"id\":201585,\"type\":2,\"name\":\"文言断句\",\"childs\":[{\"id\":204702,\"type\":3,\"name\":\"文言断句\",\"childs\":[]}]}]},{\"id\":408,\"type\":1,\"name\":\"文言翻译\",\"childs\":[{\"id\":201586,\"type\":2,\"name\":\"文言句子翻译\",\"childs\":[{\"id\":204703,\"type\":3,\"name\":\"文言句子翻译\",\"childs\":[]}]}]},{\"id\":409,\"type\":1,\"name\":\"文意理解\",\"childs\":[{\"id\":201587,\"type\":2,\"name\":\"文意理解\",\"childs\":[{\"id\":204704,\"type\":3,\"name\":\"内容概括-文言文\",\"childs\":[]},{\"id\":204705,\"type\":3,\"name\":\"把握中心题-文言文\",\"childs\":[]},{\"id\":204706,\"type\":3,\"name\":\"赏析题-文言文\",\"childs\":[]},{\"id\":204707,\"type\":3,\"name\":\"开放性试题-文言文\",\"childs\":[]},{\"id\":204708,\"type\":3,\"name\":\"人物形象分析题-文言文\",\"childs\":[]}]}]}]}]},{\"id\":410,\"type\":1,\"name\":\"现代文阅读\",\"childs\":[{\"id\":411,\"type\":1,\"name\":\"文学类文本阅读\",\"childs\":[{\"id\":412,\"type\":1,\"name\":\"文学类文本阅读知识点\",\"childs\":[{\"id\":201588,\"type\":2,\"name\":\"主要内容\",\"childs\":[{\"id\":204709,\"type\":3,\"name\":\"主要内容-文学类文本\",\"childs\":[]}]},{\"id\":201589,\"type\":2,\"name\":\"中心主旨\",\"childs\":[{\"id\":204710,\"type\":3,\"name\":\"中心主旨-文学类文本\",\"childs\":[]}]},{\"id\":201590,\"type\":2,\"name\":\"线索结构\",\"childs\":[{\"id\":204711,\"type\":3,\"name\":\"线索结构-文学类文本\",\"childs\":[]}]},{\"id\":201591,\"type\":2,\"name\":\"表达技巧\",\"childs\":[{\"id\":204712,\"type\":3,\"name\":\"表达方式-文学类文本\",\"childs\":[]},{\"id\":204713,\"type\":3,\"name\":\"修辞手法-文学类文本\",\"childs\":[]},{\"id\":204714,\"type\":3,\"name\":\"表现手法-文学类文本\",\"childs\":[]},{\"id\":204715,\"type\":3,\"name\":\"结构技巧-文学类文本\",\"childs\":[]}]},{\"id\":201592,\"type\":2,\"name\":\"语言特色\",\"childs\":[{\"id\":204716,\"type\":3,\"name\":\"词语-文学类文本\",\"childs\":[]},{\"id\":204717,\"type\":3,\"name\":\"句式-文学类文本\",\"childs\":[]},{\"id\":204718,\"type\":3,\"name\":\"语言风格-文学类文本\",\"childs\":[]}]},{\"id\":201593,\"type\":2,\"name\":\"形象-知识点\",\"childs\":[{\"id\":204719,\"type\":3,\"name\":\"人物形象--文学类文本\",\"childs\":[]},{\"id\":204720,\"type\":3,\"name\":\"意象--文学类文本\",\"childs\":[]},{\"id\":204721,\"type\":3,\"name\":\"物象--文学类文本\",\"childs\":[]}]}]},{\"id\":413,\"type\":1,\"name\":\"文学类文本阅读题型\",\"childs\":[{\"id\":201594,\"type\":2,\"name\":\"文学类文本阅读概括题\",\"childs\":[{\"id\":204722,\"type\":3,\"name\":\"概括内容主旨\",\"childs\":[]},{\"id\":204723,\"type\":3,\"name\":\"情节梳理\",\"childs\":[]},{\"id\":204724,\"type\":3,\"name\":\"原因分析\",\"childs\":[]}]},{\"id\":201595,\"type\":2,\"name\":\"含义理解题\",\"childs\":[{\"id\":204725,\"type\":3,\"name\":\"词语含义\",\"childs\":[]},{\"id\":204726,\"type\":3,\"name\":\"句子含义\",\"childs\":[]},{\"id\":204727,\"type\":3,\"name\":\"标题含义\",\"childs\":[]}]},{\"id\":201596,\"type\":2,\"name\":\"作用题\",\"childs\":[{\"id\":204728,\"type\":3,\"name\":\"词语作用\",\"childs\":[]},{\"id\":204729,\"type\":3,\"name\":\"句子作用\",\"childs\":[]},{\"id\":204730,\"type\":3,\"name\":\"语段作用\",\"childs\":[]},{\"id\":204731,\"type\":3,\"name\":\"环境描写作用\",\"childs\":[]},{\"id\":204732,\"type\":3,\"name\":\"记叙顺序作用\",\"childs\":[]},{\"id\":204733,\"type\":3,\"name\":\"人称作用\",\"childs\":[]},{\"id\":204734,\"type\":3,\"name\":\"标题作用\",\"childs\":[]},{\"id\":204735,\"type\":3,\"name\":\"情节作用\",\"childs\":[]},{\"id\":204736,\"type\":3,\"name\":\"线索作用\",\"childs\":[]}]},{\"id\":201597,\"type\":2,\"name\":\"赏析题\",\"childs\":[{\"id\":204737,\"type\":3,\"name\":\"词句\",\"childs\":[]},{\"id\":204738,\"type\":3,\"name\":\"段落\",\"childs\":[]},{\"id\":204739,\"type\":3,\"name\":\"全文\",\"childs\":[]}]},{\"id\":201598,\"type\":2,\"name\":\"形象分析题\",\"childs\":[{\"id\":204740,\"type\":3,\"name\":\"人物形象\",\"childs\":[]},{\"id\":204741,\"type\":3,\"name\":\"意象\",\"childs\":[]},{\"id\":204742,\"type\":3,\"name\":\"物象\",\"childs\":[]}]},{\"id\":201599,\"type\":2,\"name\":\"文学类文本阅读开放性试题\",\"childs\":[{\"id\":204743,\"type\":3,\"name\":\"提问类\",\"childs\":[]},{\"id\":204744,\"type\":3,\"name\":\"感悟启示类\",\"childs\":[]},{\"id\":204745,\"type\":3,\"name\":\"观点看法类\",\"childs\":[]},{\"id\":204746,\"type\":3,\"name\":\"续写类\",\"childs\":[]}]}]}]},{\"id\":414,\"type\":1,\"name\":\"说明文阅读\",\"childs\":[{\"id\":415,\"type\":1,\"name\":\"说明文题型\",\"childs\":[{\"id\":201600,\"type\":2,\"name\":\"句段作用题\",\"childs\":[{\"id\":204747,\"type\":3,\"name\":\"句段作用题-说明文\",\"childs\":[]}]},{\"id\":201601,\"type\":2,\"name\":\"说明文概括题\",\"childs\":[{\"id\":204748,\"type\":3,\"name\":\"概括题-说明文\",\"childs\":[]}]},{\"id\":201602,\"type\":2,\"name\":\"图文信息\",\"childs\":[{\"id\":204749,\"type\":3,\"name\":\"图文信息-说明文\",\"childs\":[]}]},{\"id\":201603,\"type\":2,\"name\":\"材料链接题\",\"childs\":[{\"id\":204750,\"type\":3,\"name\":\"材料链接题-说明文\",\"childs\":[]}]},{\"id\":201604,\"type\":2,\"name\":\"说明文开放性试题\",\"childs\":[{\"id\":204751,\"type\":3,\"name\":\"开放性试题-说明文\",\"childs\":[]}]},{\"id\":201605,\"type\":2,\"name\":\"说明顺序题\",\"childs\":[{\"id\":204752,\"type\":3,\"name\":\"说明顺序题\",\"childs\":[]}]},{\"id\":201606,\"type\":2,\"name\":\"说明结构题\",\"childs\":[{\"id\":204753,\"type\":3,\"name\":\"说明结构题\",\"childs\":[]}]},{\"id\":201607,\"type\":2,\"name\":\"说明方法题\",\"childs\":[{\"id\":204754,\"type\":3,\"name\":\"说明方法题\",\"childs\":[]}]},{\"id\":201608,\"type\":2,\"name\":\"说明语言题\",\"childs\":[{\"id\":204755,\"type\":3,\"name\":\"说明语言题\",\"childs\":[]}]}]},{\"id\":416,\"type\":1,\"name\":\"说明文知识点\",\"childs\":[{\"id\":201609,\"type\":2,\"name\":\"说明对象\",\"childs\":[{\"id\":204756,\"type\":3,\"name\":\"说明对象\",\"childs\":[]}]}]}]},{\"id\":417,\"type\":1,\"name\":\"议论文阅读\",\"childs\":[{\"id\":418,\"type\":1,\"name\":\"议论文阅读题型\",\"childs\":[{\"id\":201610,\"type\":2,\"name\":\"论点题\",\"childs\":[{\"id\":204757,\"type\":3,\"name\":\"论点题\",\"childs\":[]}]},{\"id\":201611,\"type\":2,\"name\":\"论据题\",\"childs\":[{\"id\":204758,\"type\":3,\"name\":\"论据题\",\"childs\":[]}]},{\"id\":201612,\"type\":2,\"name\":\"论证方法题\",\"childs\":[{\"id\":204759,\"type\":3,\"name\":\"论证方法题\",\"childs\":[]}]},{\"id\":201613,\"type\":2,\"name\":\"论证过程题\",\"childs\":[{\"id\":204760,\"type\":3,\"name\":\"论证过程题\",\"childs\":[]}]},{\"id\":201614,\"type\":2,\"name\":\"议论文阅读概括题\",\"childs\":[{\"id\":204761,\"type\":3,\"name\":\"概括题-议论文\",\"childs\":[]}]},{\"id\":201615,\"type\":2,\"name\":\"体会语言特点题\",\"childs\":[{\"id\":204762,\"type\":3,\"name\":\"体会语言特点题-议论文\",\"childs\":[]}]},{\"id\":201616,\"type\":2,\"name\":\"词句含义和作用题\",\"childs\":[{\"id\":204763,\"type\":3,\"name\":\"词句含义和作用题-议论文\",\"childs\":[]}]},{\"id\":201617,\"type\":2,\"name\":\"段落作用题\",\"childs\":[{\"id\":204764,\"type\":3,\"name\":\"段落作用题-议论文\",\"childs\":[]}]},{\"id\":201618,\"type\":2,\"name\":\"议论文开放性试题\",\"childs\":[{\"id\":204765,\"type\":3,\"name\":\"开放性试题-议论文\",\"childs\":[]}]}]}]},{\"id\":419,\"type\":1,\"name\":\"其他文体阅读\",\"childs\":[{\"id\":420,\"type\":1,\"name\":\"诗歌\",\"childs\":[{\"id\":201619,\"type\":2,\"name\":\"现代诗歌鉴赏\",\"childs\":[{\"id\":204766,\"type\":3,\"name\":\"现代诗歌鉴赏\",\"childs\":[]}]}]}]}]},{\"id\":421,\"type\":1,\"name\":\"作文\",\"childs\":[{\"id\":422,\"type\":1,\"name\":\"大作文\",\"childs\":[{\"id\":423,\"type\":1,\"name\":\"写作话题分类\",\"childs\":[{\"id\":201620,\"type\":2,\"name\":\"青春风采\",\"childs\":[{\"id\":204767,\"type\":3,\"name\":\"青春风采\",\"childs\":[]}]},{\"id\":201633,\"type\":2,\"name\":\"社会感悟\",\"childs\":[{\"id\":204780,\"type\":3,\"name\":\"社会感悟\",\"childs\":[]}]},{\"id\":201632,\"type\":2,\"name\":\"人物速写\",\"childs\":[{\"id\":204779,\"type\":3,\"name\":\"人物速写\",\"childs\":[]}]},{\"id\":201631,\"type\":2,\"name\":\"亲近自然\",\"childs\":[{\"id\":204778,\"type\":3,\"name\":\"亲近自然\",\"childs\":[]}]},{\"id\":201630,\"type\":2,\"name\":\"读书之美\",\"childs\":[{\"id\":204777,\"type\":3,\"name\":\"读书之美\",\"childs\":[]}]},{\"id\":201629,\"type\":2,\"name\":\"学校生活\",\"childs\":[{\"id\":204776,\"type\":3,\"name\":\"学校生活\",\"childs\":[]}]},{\"id\":201628,\"type\":2,\"name\":\"追求梦想\",\"childs\":[{\"id\":204775,\"type\":3,\"name\":\"追求梦想\",\"childs\":[]}]},{\"id\":201627,\"type\":2,\"name\":\"美德修养\",\"childs\":[{\"id\":204774,\"type\":3,\"name\":\"美德修养\",\"childs\":[]}]},{\"id\":201626,\"type\":2,\"name\":\"人生哲理\",\"childs\":[{\"id\":204773,\"type\":3,\"name\":\"人生哲理\",\"childs\":[]}]},{\"id\":201625,\"type\":2,\"name\":\"成长经历\",\"childs\":[{\"id\":204772,\"type\":3,\"name\":\"成长经历\",\"childs\":[]}]},{\"id\":201624,\"type\":2,\"name\":\"真情温暖\",\"childs\":[{\"id\":204771,\"type\":3,\"name\":\"真情温暖\",\"childs\":[]}]},{\"id\":201623,\"type\":2,\"name\":\"传统文化\",\"childs\":[{\"id\":204770,\"type\":3,\"name\":\"传统文化\",\"childs\":[]}]},{\"id\":201622,\"type\":2,\"name\":\"地域风光\",\"childs\":[{\"id\":204769,\"type\":3,\"name\":\"地域风光\",\"childs\":[]}]},{\"id\":201621,\"type\":2,\"name\":\"热爱家乡\",\"childs\":[{\"id\":204768,\"type\":3,\"name\":\"热爱家乡\",\"childs\":[]}]},{\"id\":201634,\"type\":2,\"name\":\"想象世界\",\"childs\":[{\"id\":204781,\"type\":3,\"name\":\"想象世界\",\"childs\":[]}]}]},{\"id\":424,\"type\":1,\"name\":\"写作手法分类\",\"childs\":[{\"id\":201635,\"type\":2,\"name\":\"人物描写\",\"childs\":[{\"id\":204782,\"type\":3,\"name\":\"人物描写\",\"childs\":[]}]},{\"id\":201649,\"type\":2,\"name\":\"设置波澜\",\"childs\":[{\"id\":204796,\"type\":3,\"name\":\"设置波澜\",\"childs\":[]}]},{\"id\":201648,\"type\":2,\"name\":\"以小见大\",\"childs\":[{\"id\":204795,\"type\":3,\"name\":\"以小见大\",\"childs\":[]}]},{\"id\":201647,\"type\":2,\"name\":\"间接抒情\",\"childs\":[{\"id\":204794,\"type\":3,\"name\":\"间接抒情\",\"childs\":[]}]},{\"id\":201646,\"type\":2,\"name\":\"直接抒情\",\"childs\":[{\"id\":204793,\"type\":3,\"name\":\"直接抒情\",\"childs\":[]}]},{\"id\":201645,\"type\":2,\"name\":\"想象\",\"childs\":[{\"id\":204792,\"type\":3,\"name\":\"想象\",\"childs\":[]}]},{\"id\":201644,\"type\":2,\"name\":\"联想\",\"childs\":[{\"id\":204791,\"type\":3,\"name\":\"联想\",\"childs\":[]}]},{\"id\":201643,\"type\":2,\"name\":\"叙述顺序\",\"childs\":[{\"id\":204790,\"type\":3,\"name\":\"叙述顺序\",\"childs\":[]}]},{\"id\":201642,\"type\":2,\"name\":\"线索\",\"childs\":[{\"id\":204789,\"type\":3,\"name\":\"线索\",\"childs\":[]}]},{\"id\":201641,\"type\":2,\"name\":\"铺垫、衬托\",\"childs\":[{\"id\":204788,\"type\":3,\"name\":\"铺垫、衬托\",\"childs\":[]}]},{\"id\":201640,\"type\":2,\"name\":\"对比\",\"childs\":[{\"id\":204787,\"type\":3,\"name\":\"对比\",\"childs\":[]}]},{\"id\":201639,\"type\":2,\"name\":\"抑扬结合\",\"childs\":[{\"id\":204786,\"type\":3,\"name\":\"抑扬结合\",\"childs\":[]}]},{\"id\":201638,\"type\":2,\"name\":\"虚实结合\",\"childs\":[{\"id\":204785,\"type\":3,\"name\":\"虚实结合\",\"childs\":[]}]},{\"id\":201637,\"type\":2,\"name\":\"细节描写\",\"childs\":[{\"id\":204784,\"type\":3,\"name\":\"细节描写\",\"childs\":[]}]},{\"id\":201636,\"type\":2,\"name\":\"环境描写\",\"childs\":[{\"id\":204783,\"type\":3,\"name\":\"环境描写\",\"childs\":[]}]},{\"id\":201650,\"type\":2,\"name\":\"托物言志\",\"childs\":[{\"id\":204797,\"type\":3,\"name\":\"托物言志\",\"childs\":[]}]}]}]},{\"id\":425,\"type\":1,\"name\":\"小作文\",\"childs\":[{\"id\":426,\"type\":1,\"name\":\"描写类\",\"childs\":[{\"id\":201651,\"type\":2,\"name\":\"描写类\",\"childs\":[{\"id\":204798,\"type\":3,\"name\":\"描写类\",\"childs\":[]}]}]},{\"id\":427,\"type\":1,\"name\":\"评论劝说推荐类\",\"childs\":[{\"id\":201652,\"type\":2,\"name\":\"评论劝说推荐类\",\"childs\":[{\"id\":204799,\"type\":3,\"name\":\"评论劝说推荐类\",\"childs\":[]}]}]},{\"id\":428,\"type\":1,\"name\":\"应用文类\",\"childs\":[{\"id\":201653,\"type\":2,\"name\":\"应用文类\",\"childs\":[{\"id\":204800,\"type\":3,\"name\":\"应用文类\",\"childs\":[]}]}]},{\"id\":429,\"type\":1,\"name\":\"漫画拓展类\",\"childs\":[{\"id\":201654,\"type\":2,\"name\":\"漫画拓展类\",\"childs\":[{\"id\":204801,\"type\":3,\"name\":\"漫画拓展类\",\"childs\":[]}]}]},{\"id\":430,\"type\":1,\"name\":\"情景类\",\"childs\":[{\"id\":201655,\"type\":2,\"name\":\"情景类\",\"childs\":[{\"id\":204802,\"type\":3,\"name\":\"古诗词\",\"childs\":[]}]}]}]}]}]}";

    }

    public static void b(){
        int a = -8;
        System.out.println(a >> 1);
        System.out.println(a >>> 1);        //0000 0000 0000 1000      反码 1111 1111 1111 0111  补码 1111 1111 1111 1000
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(a >>> 2));
        System.out.println("111111111111111111111111111110".length());
    }

    public static void a(){
        String result = "1079\t,460\n" +
                "785\t,460\n" +
                "797\t,460\n" +
                "770\t,460\n" +
                "771\t,460\n" +
                "831\t,460\n" +
                "913\t,460\n" +
                "914\t,460\n" +
                "915\t,460\n" +
                "1050\t,460\n" +
                "1051\t,460\n" +
                "1052\t,460\n" +
                "1053\t,460\n" +
                "1054\t,460\n" +
                "1144\t,460\n" +
                "1158\t,460\n" +
                "1157\t,460\n" +
                "1159\t,460\n" +
                "1072\t,461\n" +
                "1073\t,461";

        String[] split = result.split("\n");
        List<String> list = new ArrayList<>();

        for(String item : split){
            String s = item.replaceAll(" ", "");
            s = s.replaceAll("\t", "");
            String[] split1 = s.split(",");
            String userId = split1[0];
            String gradeId = split1[1];
            System.out.println("update sc_grade_student_rel set grade_id = " + gradeId + " where student_id = " + userId + ";");
        }
    }

    public static void c(){
        String sql = "1,438,22,202\n" +
                "1,439,-1,-1\n" +
                "1,451,-1,-1\n" +
                "1,452,-1,-1\n" +
                "1,3395,23,205\n" +
                "1,3396,21,208\n" +
                "1,3397,-1,-1\n" +
                "1,3398,-1,231\n" +
                "1,3399,105,323\n" +
                "1,3400,38,227\n" +
                "1,3401,-1,-1\n" +
                "1,3402,-1,-1\n" +
                "1,3403,-1,-1\n" +
                "1,3404,-1,-1\n" +
                "1,85041,-1,-1\n" +
                "2,438,7,203\n" +
                "2,439,11,214\n" +
                "2,451,13,216\n" +
                "2,452,107,234\n" +
                "2,3395,6,206\n" +
                "2,3396,34,209\n" +
                "2,3397,-1,-1\n" +
                "2,3398,100,230\n" +
                "2,3399,-1,324\n" +
                "2,3400,-1,-1\n" +
                "2,3401,-1,-1\n" +
                "2,3402,-1,-1\n" +
                "2,3403,108,235\n" +
                "2,3404,109,237\n" +
                "2,85041,110,238\n" +
                "3,438,30,204\n" +
                "3,439,32,215\n" +
                "3,451,31,217\n" +
                "3,452,33,218\n" +
                "3,3395,46,207\n" +
                "3,3396,35,210\n" +
                "3,3397,-1,-1\n" +
                "3,3398,-1,-1\n" +
                "3,3399,-1,-1\n" +
                "3,3400,-1,-1\n" +
                "3,3401,-1,-1\n" +
                "3,3402,-1,-1\n" +
                "3,3403,116,236\n" +
                "3,3404,115,239\n" +
                "3,85041,117,240";
        String[] split = sql.split("\n");
        for (String i : split){
            String[] split1 = i.split(",");
            String format = String.format("insert into acz_jt_subject_map (acz_faculty_id,acz_subject_id,jt_courseware_subject_id,jt_subject_id) values(%s,%s,%s,%s)", split1[0], split1[1], split1[2], split1[3]);
            System.out.println(format);
        }
    }
}
