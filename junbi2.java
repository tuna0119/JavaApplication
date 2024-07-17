public class junbi2 /**
 * dateData getter
 */
public String getDateData() {
    return dateData;
}
/**
 * 今日の日付取得
 */
public String getToday() {
    Calendar cal = Calendar.getInstance();
    return String.format("%02d", cal.get(Calendar.YEAR)) +
            String.format("%02d", cal.get(Calendar.MONTH)) +
            String.format("%02d", cal.get(Calendar.DAY_OF_MONTH));{
}
