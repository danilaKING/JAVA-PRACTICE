void main(){
    // ===== String =====
    String str = "Hello";

    // String -> StringBuffer
    StringBuffer sb = new StringBuffer(str);
    System.out.println("String -> StringBuffer: " + sb);

    // String -> StringBuilder
    StringBuilder sbd = new StringBuilder(str);
    System.out.println("String -> StringBuilder: " + sbd);

    // ===== StringBuffer =====
    sb.append(" World"); // добавим текст
    System.out.println("StringBuffer: " + sb);

    // StringBuffer -> String
    String strFromSB = sb.toString();
    System.out.println("StringBuffer -> String: " + strFromSB);

    // StringBuffer -> StringBuilder
    StringBuilder sbdFromSB = new StringBuilder(sb.toString());
    System.out.println("StringBuffer -> StringBuilder: " + sbdFromSB);

    // ===== StringBuilder =====
    sbd.append(" Java"); // добавим текст
    System.out.println("StringBuilder: " + sbd);

    // StringBuilder -> String
    String strFromSBD = sbd.toString();
    System.out.println("StringBuilder -> String: " + strFromSBD);

    // StringBuilder -> StringBuffer
    StringBuffer sbFromSBD = new StringBuffer(sbd.toString());
    System.out.println("StringBuilder -> StringBuffer: " + sbFromSBD);
}