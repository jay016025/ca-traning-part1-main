# CA Traning Part1 202205

微服務理論與實作訓練: CA 篇 Part 1

---

### Single Responsibility Principle(SRP) ###

- 定義: 一個類別只可以有一個改變的理由。

    也就是說希望此class、interface被改動的原因只有一個。

---

### Open/Closed Principle(OCP) ###

- 定義: 軟體 entity，像是 classes、modules、functions,應該只對擴展開放，但對修改封閉。
  
    也就是說當系統需要被擴充時，應藉由新增新的程式碼來擴充新功能，而非通過修改原有程式碼。

- OCP優點: 
  - 降低耦合
  - 增加擴展性
  - 易於維護
---

### Liskov Substitution Principle(LSP) ###

- 定義: 子類別可以擴充套件父類別的功能，但不改變父類別原有的功能。
- 包含的四層涵義: 
  1. 子類別必須完全實現父類別的方法
  2. 子類別可以有自己的特性
  3. 重載(Overload)或者實現父類別的方法時輸入參數可以被放大(參數的父類別)
  4. 覆蓋或者實現父類別的方法時輸出結果可以被縮小

---

### Interface Segregation Principle(ISP) ###

- 定義: 客戶不應該被強迫依賴他們不使用的方法。
- ISP的目標:
  - 不要讓interface包過多的功能。
  - 不應該強迫實作沒有用到的方法。
  - 實現class間的低耦合。

---

### Dependency Inversion Principle(DIP) ###

- 定義: 
  1. 高層模組不應該依賴低層模組，兩者皆應依賴於抽象。
  2. 抽象不應該依賴細節，細節應該依賴於抽象。
- DIP的優點:
  - 减少class間的耦合性，提高系统的穩定性
  - 降低開發時的風險
  - 提高系統可讀及維護性

---