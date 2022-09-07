const puppeteer = require('puppeteer')
const fs = require('fs')
const { getElementById, getElementsByTagName } = require('domutils')

const main = async () => {
    const browser = await puppeteer.launch()
    const page = await browser.newPage()
    await page.goto('https://lms.skhu.ac.kr/ilos/community/notice_list.acl', { waitUntil: 'networkidle2'})
    const result = getElementsByTagName
    const html = await page.content()
    fs.writeFileSync("example.html", html)
    await browser.close()
}
main()