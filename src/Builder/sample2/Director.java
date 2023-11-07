package Builder.sample2;

public class Director {
    private Builder builder;

    // コンストラクタ
    public Director(Builder builder) {
        this.builder = builder;
    }

    // 文書を作るメソッド
    public void construct() {
        builder.makeTitle("Bye");
        builder.makeString("気軽な別れのあいさつ");
        builder.makeItems(new String[]{
            "See you.",
            "Take care.",
            "Bye."
        });
        builder.makeString("丁寧な別れのあいさつ");
        builder.makeItems(new String[]{
            "It was nice to see you.",
            "I'm looking forward to seeing you again.",
        });
        builder.close();
    }
}
