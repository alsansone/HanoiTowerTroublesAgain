# Hanoi Tower Troubles Again!

[URI 1166](https://www.urionlinejudge.com.br/judge/en/problems/view/1166)

People stopped moving discs from peg to peg after they found the number of steps needed to complete the 
entire task. On the other hand, they didn't stop thinking about similar puzzles with the 
Hanoi Tower. Mr. S invented a little game on it. The game consists of **N** pegs, and a **LOT** of balls. 
The balls are numbered 1,2,3,... The balls look ordinary, but they are actually magic. If the sum of 
the numbers on two balls is **NOT** a square number, they will push each other with great force, 
so they can **NEVER** be touching each other.

The player should place one ball on the top of a peg at a time. They should first try ball 1, then ball 2, 
then ball 3... If they fail to do so, the game ends. Help the player place as many balls as possible.

## Input

The first line of the input contains a single integer **T** (1 ≤ **T** ≤ 50), indicating the number 
of test cases. Each test case contains a single integer **N** (1 ≤ **N** ≤ 50), indicating the number 
of pegs available.

## Output

For each test case in the input print a line containing an integer indicating the maximal number of 
balls that can be placed. Print -1 if an infinite number of balls can be placed.
