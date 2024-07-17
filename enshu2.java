public static String displayDate(String inputDate) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    Calendar calendar = Calendar.getInstance();
    return sdf.format(calendar.getTime());
}

