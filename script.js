function processUserInput() {
    const userInput = document.getElementById('userInput').value;
    let resultScreen = document.getElementById('result-screen');
    resultScreen.style.display = 'block';

    switch (userInput) {
        case '1':
            resultScreen.innerHTML = `<h4>Transfer Pulsa</h4>
                <p>Masukkan nomor tujuan:</p>
                <input type="text" id="recipient" placeholder="Nomor tujuan">
                <p>Masukkan jumlah pulsa:</p>
                <input type="text" id="amount" placeholder="Jumlah pulsa">
                <button onclick="transferCredit()">Kirim Transfer</button>`;
            break;
        case '2':
            resultScreen.innerHTML = 'Saldo Anda saat ini adalah: 100.000 rupiah.';
            break;
        case '3':
            resultScreen.innerHTML = 'Terima kasih telah menggunakan layanan *858#.';
            break;
        default:
            resultScreen.innerHTML = 'Pilihan tidak valid. Silakan coba lagi.';
    }
}

function transferCredit() {
    const recipient = document.getElementById('recipient').value;
    const amount = parseFloat(document.getElementById('amount').value);
    const userBalance = 100000; // Example balance in rupiah
    let resultMessage = '';

    if (recipient.length === 10 && !isNaN(recipient)) {
        if (!isNaN(amount) && amount > 0) {
            if (amount <= userBalance) {
                resultMessage = `Transfer berhasil! Anda telah mengirim pulsa senilai Rp${amount} ke nomor ${recipient}.<br>Sisa saldo Anda adalah Rp${userBalance - amount}.`;
            } else {
                resultMessage = 'Saldo tidak mencukupi.';
            }
        } else {
            resultMessage = 'Jumlah pulsa tidak valid.';
        }
    } else {
        resultMessage = 'Nomor tujuan tidak valid.';
    }

    document.getElementById('result-screen').innerHTML = resultMessage;
}
