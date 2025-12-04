<center>

# 📈 **Stock Trading Platform**

A lightweight Java console application that simulates a basic stock trading environment. View market prices, buy and sell shares, and track your portfolio value in real time. Ideal for beginners learning arrays, loops, conditionals, and console I/O.

</center>

---

## 🖼️ Screenshot

<img width="645" height="874" alt="Screenshot 2025-12-04 at 2 53 39 PM" src="https://github.com/user-attachments/assets/efe54af4-0cf3-4c85-b9c0-3c1d6d637fd4" />

<img width="570" height="873" alt="Screenshot 2025-12-04 at 2 53 54 PM" src="https://github.com/user-attachments/assets/0dbbf471-43c0-4bd3-b363-2a24f89dafb4" />


---

## ✨ What it does

- Shows a simple list of stocks and their prices  
- Lets you buy and sell shares (quantity tracked per stock)  
- Displays your portfolio with per-stock value and total portfolio value  
- Menu-driven interface that repeats until you choose to exit

---

## 🚀 Quick overview of the program (from the code)

- Stocks: `AAPL`, `GOOGL`, `TSLA`, `YESBANK`, `BAJAJHFL`, `IRFC`, `NIKE`, `SBUX`  
- Prices: predefined double array (e.g., `212.33`, `165.37`, `347.68`, ...)  
- Owned shares tracked in an `int[]` array (same length as stocks)  
- Menu choices:
  1. View Market Data  
  2. Buy Stock  
  3. Sell Stock  
  4. View Portfolio  
  5. Exit

---

🚀 Example usage (sample session)

--- Stock Trading Platform ---
1. View Market Data
2. Buy Stock
3. Sell Stock
4. View Portfolio
5. Exit
Enter your choice: 1

--- Market Data ---
0: AAPL - $212.33
1: GOOGL - $165.37
2: TSLA - $347.68
...
Enter your choice: 2
Enter stock number to buy (0 to 7): 0
Enter quantity to buy: 5
Bought 5 shares of AAPL

Enter your choice: 4

--- Your Portfolio ---
AAPL: 5 shares (Value: $1061.65)
GOOGL: 0 shares (Value: $0.0)
...
Total Portfolio Value: $1061.65

---
🧩 Features

➤ View predefined market data

➤ Buy and sell shares with quantity checks

➤ Portfolio valuation per stock and total portfolio value

➤ Input validation for invalid indices and quantities

➤ Simple, menu-driven CLI — easy to extend

---

🛠 Tech Stack

Java 8+ (core language only)

Uses Scanner, arrays, loops, and standard console I/O

---

🔧 Notes for developers

To add new stocks, update the stocks[] and prices[] arrays — keep lengths equal.

Owned shares are stored in ownedStocks[] (int), indexed to match stocks[].

Consider adding better input handling (try/catch for non-integer input) and persistence (saving the portfolio to a file).

---

🔮 Future enhancements (roadmap)

Add persistent storage (save/load portfolio as CSV or JSON)

Add simulated price updates (randomized ticks) or CSV input for market data

Add transaction history and profit/loss calculations

Implement multiple user accounts or multiple portfolios

Create a GUI version (JavaFX or Swing)

Add unit tests for core logic

---

👤 Author

Shaurya Bhaskar
🔗 GitHub: https://github.com/shauryabhaskar

---



