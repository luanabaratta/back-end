const chalk = require('chalk');
const pegaArquivo = require('./index.js');
const validaURLs = require('./http-validacao.js');

const caminho = process.argv;

async function processaTexto(caminhoDoArquivo) {
    const resultado = await pegaArquivo(caminhoDoArquivo[2]);
    if (caminho[3] === 'validar') {
        console.log(chalk.yellow('links validados'), await validaURLs(resultado))
    } else {
        console.log(chalk.yellow('lista de links'), resultado);
    }
}

console.log(processaTexto(caminho));