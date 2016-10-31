package com.thepokemaster843.scifairencryption;

public class Blowfish {
  
  public long F(long x) {
    
    short a, b, c, d, y;
    d = x & 0x00ff;
    x >>= 8;
    c = x & 0x00ff;
    x >>= 8;
    b = x & 0x00ff;
    x >>= 8;
    a = x & 0x00ff;
    
    y = sBox[0][a];
    y += sBox[1][b];
    y ^= sBox[2][c];
    y += s[3][d];
    
    return y;
    
  }
    
}
