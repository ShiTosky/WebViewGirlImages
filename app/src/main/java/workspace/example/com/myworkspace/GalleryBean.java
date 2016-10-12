package workspace.example.com.myworkspace;

import java.util.List;

/**
 * Created by ShiLiang on 2016/10/12.
 */
public class GalleryBean {
    private static final String TAG = "GalleryBean";

    /**
     * status : true
     * total : 956
     * tngou : [{"count":145,"fcount":0,"galleryclass":1,"id":970,"img":"/ext/161011/422dd5cc3feec0ad15e13fd5ed312fac.jpg","rcount":0,"size":9,"time":1476194340000,"title":"知性美女爆乳双峰极品包臀裙"},{"count":79,"fcount":0,"galleryclass":4,"id":969,"img":"/ext/161011/0e8721774dfa892e4fbe17de963c8fc6.jpg","rcount":0,"size":10,"time":1476193160000,"title":"性感大胸美女朴正允白嫩美胸黑丝美腿性感气质美女"},{"count":59,"fcount":0,"galleryclass":5,"id":968,"img":"/ext/161011/36a165c856fbd7c37a724b7dc72118a0.jpg","rcount":0,"size":9,"time":1476193109000,"title":"职业白领黑色连衣裙私房性感写真气质美女"},{"count":50,"fcount":0,"galleryclass":3,"id":967,"img":"/ext/161011/1c847cb11d8567b8aed57de7c9a2574c.jpg","rcount":0,"size":8,"time":1476193059000,"title":"Beautyleg腿模Vicni水手学生制服美腿"},{"count":33,"fcount":0,"galleryclass":3,"id":966,"img":"/ext/161011/f3f97ba72c0feb82f99a2f8279b025cc.jpg","rcount":0,"size":13,"time":1476193019000,"title":"风情万种的美女少妇黑丝美腿火辣性感"},{"count":288,"fcount":0,"galleryclass":5,"id":965,"img":"/ext/161008/93ad433c8a718712400cef236adab3f3.jpg","rcount":0,"size":12,"time":1475926279000,"title":"高雅气质美女孙允珠斜搭肩礼服摄影写真"},{"count":235,"fcount":0,"galleryclass":3,"id":964,"img":"/ext/161008/fcd0c0e31c384b2546da654070091101.jpg","rcount":0,"size":12,"time":1475926243000,"title":"腿模Kaylar靓丽红裙长腿丝袜养眼美女"},{"count":363,"fcount":0,"galleryclass":1,"id":963,"img":"/ext/161008/a1056dbbe883a636391b386a438313d9.jpg","rcount":0,"size":20,"time":1475926166000,"title":"OL美女孙允珠性感吊带开叉红裙"},{"count":304,"fcount":0,"galleryclass":3,"id":962,"img":"/ext/161007/cd0f5d1727b1ec585f3be106f0c27700.jpg","rcount":0,"size":10,"time":1475823937000,"title":"极致喷血诱惑性感腿模小雪黑丝长腿高清人体艺术写真照图片"},{"count":200,"fcount":0,"galleryclass":7,"id":961,"img":"/ext/161007/bb3b3ae4caa1fbc1a49ee461b9396b55.jpg","rcount":0,"size":9,"time":1475823835000,"title":"爆乳翘臀美女秘书大胆黑丝吊腿丝袜"},{"count":130,"fcount":0,"galleryclass":3,"id":960,"img":"/ext/161007/44a11ac952e3e58654870fc7209fe111.jpg","rcount":0,"size":7,"time":1475823694000,"title":"穿着白色高跟鞋的极品嫩模美女极致丝袜美腿诱惑"},{"count":581,"fcount":0,"galleryclass":1,"id":959,"img":"/ext/161005/d70a3a2490bb2e84bba61051dcb2684b.jpg","rcount":0,"size":7,"time":1475659542000,"title":"清秀长发美女户外性感露背吊带裙妩媚性感写真"},{"count":354,"fcount":0,"galleryclass":5,"id":958,"img":"/ext/161005/d8991fee68a2149a62f246a974e79230.jpg","rcount":0,"size":9,"time":1475659488000,"title":"大胸美女李妍静性感低胸装私房"},{"count":628,"fcount":0,"galleryclass":4,"id":957,"img":"/ext/160929/95a4b6c26aff1f84a362ace920ed06e2.jpg","rcount":0,"size":22,"time":1475151767000,"title":"长发美女李妍静杏粉裸肩性感低胸长礼裙"},{"count":504,"fcount":0,"galleryclass":1,"id":956,"img":"/ext/160929/78d6d592b9c18552c182b3cccb1c0b3c.jpg","rcount":0,"size":31,"time":1475151452000,"title":"职业白领孙允珠流苏叉腿连衣裙性感"},{"count":529,"fcount":0,"galleryclass":3,"id":955,"img":"/ext/160928/099120d44fcfc0e358c4db4143ab50b1.jpg","rcount":0,"size":9,"time":1475061217000,"title":"极品宅男女神黑丝美腿私房妩媚性感写真卷发美女"},{"count":483,"fcount":0,"galleryclass":1,"id":954,"img":"/ext/160928/0372444674e18bfc99dec2bba8e24f00.jpg","rcount":0,"size":9,"time":1475061163000,"title":"宅男女神紧致魅惑身姿性感酒店写真"},{"count":266,"fcount":0,"galleryclass":4,"id":953,"img":"/ext/160927/3caa34a54fc778a3b7064a430060b0cb.jpg","rcount":0,"size":9,"time":1474976710000,"title":"极品长腿美女模特紧身包裙气质写真卷发美女"},{"count":556,"fcount":0,"galleryclass":5,"id":952,"img":"/ext/160927/dce4c88e736438c2d33da17bf375596d.jpg","rcount":0,"size":9,"time":1474976668000,"title":"性感少妇风情万种撩人"},{"count":1113,"fcount":0,"galleryclass":4,"id":951,"img":"/ext/160923/ab7a2923992749ac33a54281b847512e.jpg","rcount":0,"size":9,"time":1474601069000,"title":"大胸美女李妍静印花短裙美腿酥胸性感"}]
     */

    private boolean status;
    private int total;
    /**
     * count : 145
     * fcount : 0
     * galleryclass : 1
     * id : 970
     * img : /ext/161011/422dd5cc3feec0ad15e13fd5ed312fac.jpg
     * rcount : 0
     * size : 9
     * time : 1476194340000
     * title : 知性美女爆乳双峰极品包臀裙
     */

    private List<TngouBean> tngou;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TngouBean> getTngou() {
        return tngou;
    }

    public void setTngou(List<TngouBean> tngou) {
        this.tngou = tngou;
    }

    public static class TngouBean {
        private int count;
        private int fcount;
        private int galleryclass;
        private int id;
        private String img;
        private int rcount;
        private int size;
        private long time;
        private String title;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getFcount() {
            return fcount;
        }

        public void setFcount(int fcount) {
            this.fcount = fcount;
        }

        public int getGalleryclass() {
            return galleryclass;
        }

        public void setGalleryclass(int galleryclass) {
            this.galleryclass = galleryclass;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public int getRcount() {
            return rcount;
        }

        public void setRcount(int rcount) {
            this.rcount = rcount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
