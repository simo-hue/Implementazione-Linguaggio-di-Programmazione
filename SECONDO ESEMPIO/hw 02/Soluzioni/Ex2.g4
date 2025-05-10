grammar Ex2;

main : s EOF;
s    : O s O | Z s Z | Z | O ;

Z    : '0';
O    : '1';
