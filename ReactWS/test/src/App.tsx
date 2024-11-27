import { BrowserRouter, Routes, Route } from "react-router-dom";
import Header from "./Header";
import Home from "./Home";
import About from "./About";
import Notice from "./Notice";
import Footer from "./Footer";
function App() {
  return (
    <BrowserRouter>
      <div>
        <Header />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/notice" element={<Notice />} />
        </Routes>
        <Footer />
      </div>
    </BrowserRouter>
  );
}
export default App;
