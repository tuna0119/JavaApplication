public class junbi3 /**
 * 今日か否かの判定
 */
public boolean isToday(String yyyymmdd) {
    if(yyyymmdd == (getToday()) ){
        return true;
    }
    return false;
}
/**
 * うるう年判定 String
 */
public boolean isLeapYear(String yyyymmdd) {
    return isLeapYear(Integer.parseInt(yyyymmdd.substring(0,4)));
}
 3/{
}
