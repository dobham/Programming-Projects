<?php
$input = "BONJOUR";
$arr = array();
$vowels = ['A','E','I','O','U'];
$vt = 0;
$ct = 0;
for($i = 0;$i < strlen($input);$i++){
	$flag = false;
	foreach($vowels as $v){
		if($input[$i] == $v){
			$flag = true;
			$vt++;
			break;
		}
	}
	if($flag == false){
		$ct++;
	}
}
echo "Number of Vowels: " . $vt . "<br>Number of Consonants: " . $ct;
?>
<br>
<?php
	$o = ["ABC","ABCA","ABCAB"];
	for($l = 0;$l < count($o);$l++){
		for($i = 0;$i < strlen($o[$l]);$i++){
			$str = $o[$l];
			if(strpos($str,$str[$i],$i+1) === false){
				echo substr($o[$l],$i,1) . " is unique<br>";
				break;
			}
		}
	}
?>
<br>
<?php
	$orig = ["S","T","O","P"];
	$test = $orig;
	$test[0] = $orig[2];
	$test[1] = $orig[3];
	$test[3] = $orig[1];
	$test[2] = $orig[0];
	
	echo $test[0] . $test[1] . $test[2] . $test[3];
	
?>