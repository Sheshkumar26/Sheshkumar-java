import java.io.*;
import java.util.*;

public class Answer {

    public static void main(String[] args) {
        public long power(int n, int p) throws Exception
{
    if (n < 0 || p < 0)
    {
        throw new Exception("n or p should not be negative.");
    }
    else if (n == 0 && p == 0)
    {
        throw new Exception("n and p should not be zero.");
    }
    long result = 1;
    for (int i = 0; i < p; i++)
    {
        result = result * n;
    }
    return result;
}
        
    }
}
