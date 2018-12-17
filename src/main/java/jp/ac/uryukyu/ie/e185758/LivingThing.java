package jp.ac.uryukyu.ie.e185758;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name　敵とヒーローの名前
     * @param maximumHP　敵とヒーローのHP
     * @param attack 敵とヒーローの攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    public boolean isDead() {
        return dead;
    }

    public String getName(){
        return name;
    }
    public void attack(LivingThing opponent){
        if(!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
    public int getHitPoint(){
        return hitPoint;
    }
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }
    public int getAttack() {
        return attack;
    }
    public boolean getDead(){
        return dead;
    }
    public boolean setDead(boolean dead){
        this.dead = dead;
        return dead;
    }
}
