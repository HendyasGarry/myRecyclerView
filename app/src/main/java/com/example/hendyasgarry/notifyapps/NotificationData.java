package com.example.hendyasgarry.notifyapps;

import java.util.ArrayList;

public class NotificationData {
    public static String[][] data = new String[][]{
            {"LAIN", "JessNoLimit : ayo maen ML gaes", "https://www.google.co.id/imgres?imgurl=https%3A%2F%2Fyt3.ggpht.com%2Fa-%2FACSszfEvHs9YELnWKY8tmr1gJmN9GPP8KeBIRRR3aA%3Ds900-mo-c-c0xffffffff-rj-k-no&imgrefurl=https%3A%2F%2Fwww.youtube.com%2Fchannel%2FUCvh1at6xpV1ytYOAzxmqUsA&docid=IDGTPc9HQFw9FM&tbnid=n3a0B-0MQJCH7M%3A&vet=10ahUKEwiBpcPZl4bdAhUM2o8KHRwKCGcQMwg1KAAwAA..i&w=900&h=900&safe=strict&bih=617&biw=1280&q=jessnolimit&ved=0ahUKEwiBpcPZl4bdAhUM2o8KHRwKCGcQMwg1KAAwAA&iact=mrc&uact=8"},
            {"WashLap", "Jokowi : silahkan ambil sepedanya di toko terdekat", "https://www.google.co.id/imgres?imgurl=https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Joko_Widodo_2014_official_portrait.jpg/1200px-Joko_Widodo_2014_official_portrait.jpg&imgrefurl=https://id.wikipedia.org/wiki/Joko_Widodo&h=1505&w=1200&tbnid=p5OhfkBj5j2hsM:&q=jokowi&tbnh=160&tbnw=127&usg=AFrqEzfY9EzL8kmkHTjQUQQ2O3jPPPNPKw&vet=12ahUKEwiL04CwmobdAhUSTI8KHf5CAO0Q_B0wInoECAsQFA..i&docid=0erImBKMv8y1MM&itg=1&sa=X&ved=2ahUKEwiL04CwmobdAhUSTI8KHf5CAO0Q_B0wInoECAsQFA"},
            {"InstanKram", "Tahilalats : cek postingan terbaru gue yah", "https://www.google.co.id/imgres?imgurl=https://img.duniaku.net/2017/03/tahilalats-11.jpg&imgrefurl=https://www.duniaku.net/2017/03/26/meme-tahilalats-lulusan-terbaik/&h=645&w=640&tbnid=XiaX6ze97SsSWM:&q=tahilalats&tbnh=156&tbnw=155&usg=AFrqEzd32inSs9VicHDwODdV8w_1JfKKoQ&vet=12ahUKEwiFzYXCmobdAhVKq48KHTZlAusQ_B0wGHoECAgQFA..i&docid=zTQm_V6PU9LnlM&itg=1&sa=X&ved=2ahUKEwiFzYXCmobdAhVKq48KHTZlAusQ_B0wGHoECAgQFA"},
            {"Delegram", "Peter Parker : I don't feel so good mr. Stark! ehh salkir nying", "https://www.google.co.id/imgres?imgurl=http://www.gstatic.com/tv/thumb/persons/733885/733885_v9_bb.jpg&imgrefurl=http://google.com/search?tbm%3Disch%26q%3DTom%2520Holland&h=1440&w=1080&tbnid=nF1qAZnDjRDjjM:&q=tom+holland&tbnh=186&tbnw=139&usg=AFrqEzcCB31cZv3eArUAycEwYlCKaAhwHA&vet=12ahUKEwjc6-GJm4bdAhVFwI8KHR8yDXwQ_B0wEnoECAoQCQ..i&docid=U3K0IvjUgtScUM&itg=1&sa=X&ved=2ahUKEwjc6-GJm4bdAhVFwI8KHR8yDXwQ_B0wEnoECAoQCQ"}
    };

    public static ArrayList<IncomingNotif> getListData(){
        IncomingNotif incomingNotif = null;
        ArrayList<IncomingNotif> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            incomingNotif = new IncomingNotif();
            incomingNotif.setName(data[i][0]);
            incomingNotif.setRemarks(data[i][1]);
            incomingNotif.setPhoto(data[i][2]);

            list.add(incomingNotif);
        }

        return list;
    }
}
