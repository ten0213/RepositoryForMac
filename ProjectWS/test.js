const puppeteer = require('puppeteer')
const request = require('request')
const fs = require('fs')


const main = async () => {
    const browser = await puppeteer.launch()
    const page = await browser.newPage()

    const url = 'http://apis.data.go.kr/3160000/guroPointFocInfoSvc/getGuro10PointFocInfoSvc';
    await page.goto(url, { waitUntil: 'networkidle2' })

    var queryParams = '?' + encodeURIComponent('serviceKey') + '=XXsK%2F1XwVTPaVFfkrpoBQapqSlNiziqMMJJRcS549BH3B2gH1ph4mkRwBJgDbI20uZDnt9SiLbsVlFT5%2FAHCBQ%3D%3D'; /* Service Key*/
    queryParams += '&' + encodeURIComponent('returnType') + '=' + encodeURIComponent('xml'); /* */
    queryParams += '&' + encodeURIComponent('numOfRows') + '=' + encodeURIComponent('10'); /* */
    queryParams += '&' + encodeURIComponent('pageNo') + '=' + encodeURIComponent('1'); /* */

    var result = request({
        url: url + queryParams,
        method: 'GET'
    }, function (error, response, body) {
        console.log('Status', response.statusCode);
        console.log('Headers', JSON.stringify(response.headers));
        console.log('Reponse received', body);
    });
    result = await page.content()
    fs.writeFileSync("example.html", result)
    console.log(result)
    await browser.close()
}
main()