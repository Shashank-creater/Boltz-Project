<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
    <style>
        .active-sort-by {
            color: #2874f0;
            font-weight: 500;
            border-bottom-width: 2px;
            border-bottom-style: solid;
            border-bottom-color: #2874f0;
        }
        .product-link:before {
            content: '';
            position: absolute;
            top: 0;
            bottom: 0;
            right: 0;
            left: 0;
            z-index: -1;
        }
        .product-link:hover:before {
            box-shadow: 0 .5rem 1rem rgba(0,0,0,.15)!important;
        }
    </style>
</head>
  <body class="text-secondary" style="background: #f1f3f6;">
    <div class="" style="margin: 0 auto;max-width: 1680px;padding: 8px;">
      <div class="row">
        <!-- Sidebar section start -->
        <div class="col-sm-2 d-none d-sm-block" >
          <div class="p-3 " style="background:white;">
 
            <div class="row">
                <div class="col-sm-7"> 
                    <h5 class="text-dark"> Filters </h5>
                </div>
                <div class="col-sm-5"> 
                  <a href="#" class="small"> CLEAR ALL </a>
                </div>
            </div>
 
            <hr>
 
            <div>
              <h6 class="text-dark"> Price </h6>
              <form action="#">
                <div class="custom-control custom-radio">
                  <input type="radio" class="custom-control-input" id="priceBelow500" name="price" value="500">
                  <label class="custom-control-label" for="priceBelow500"> Below INR 500 </label>
                </div>
                <div class="custom-control custom-radio">
                  <input type="radio" class="custom-control-input" id="priceBelow1000" name="price" value="1000">
                  <label class="custom-control-label" for="priceBelow1000"> Below INR 1000 </label>
                </div>
                <div class="custom-control custom-radio">
                  <input type="radio" class="custom-control-input" id="priceBelow2000" name="price" value="2000">
                  <label class="custom-control-label" for="priceBelow2000"> Below INR 2000 </label>
                </div>
                <div class="custom-control custom-radio">
                  <input type="radio" class="custom-control-input" id="priceBelow5000" name="price" value="5000">
                  <label class="custom-control-label" for="priceBelow5000"> Below INR 5000 </label>
                </div>
                <div class="custom-control custom-radio">
                  <input type="radio" class="custom-control-input" id="priceBelow10000" name="price" value="10000">
                  <label class="custom-control-label" for="priceBelow10000"> Below INR 10000 </label>
                </div>
                <div class="custom-control custom-radio">
                  <input type="radio" class="custom-control-input" id="priceAbove10000" name="price" value="10001">
                  <label class="custom-control-label" for="priceAbove10000"> Above INR 10000 </label>
                </div>
              </form>
            </div>
             
            <hr>
             
            <div>
              <h6 class="text-dark"> Discount </h6>
              <form action="#">
                <div class="custom-control custom-radio">
                  <input type="radio" class="custom-control-input" id="discount50" name="discount" value="50">
                  <label class="custom-control-label" for="discount50">50% or more</label>
                </div>
                <div class="custom-control custom-radio">
                  <input type="radio" class="custom-control-input" id="discount40" name="discount" value="40">
                  <label class="custom-control-label" for="discount40">40% or more</label>
                </div>
                <div class="custom-control custom-radio">
                  <input type="radio" class="custom-control-input" id="discount30" name="discount" value="30">
                  <label class="custom-control-label" for="discount30">30% or more</label>
                </div>
                <div class="custom-control custom-radio">
                  <input type="radio" class="custom-control-input" id="discount20" name="discount" value="20">
                  <label class="custom-control-label" for="discount20">20% or more</label>
                </div>
                <div class="custom-control custom-radio">
                  <input type="radio" class="custom-control-input" id="discount10" name="discount" value="10">
                  <label class="custom-control-label" for="discount10">10% or more</label>
                </div>
                <div class="custom-control custom-radio">
                  <input type="radio" class="custom-control-input" id="discount0" name="discount" value="0">
                  <label class="custom-control-label" for="discount0">None</label>
                </div>
              </form>
            </div>
 
          </div>
        </div>
        <!-- Sidebar section end -->
 
        <!-- Result Contents section start-->
        <div class="col-sm-10 p-3" style="background:white;">
          <!-- Current Page Path -->
          <div> 
            <a href="#" class="text-secondary small"> Home </a>
            <span class="text-secondary small"> > </span>
            <a href="#" class="text-secondary small">Clothing</a>
            <span class="text-secondary small"> > </span>
            <a href="#" class="text-secondary small">Men's Clothing</a>
            <span class="text-secondary small"> > </span>
            <a href="#" class="text-secondary small">T-shirt</a>
          </div>
 
          <div class="pt-1">
            <h5 class="text-dark d-inline"> T Shirts </h5> 
            <small>(Showing 1 - 40 products of 80,203 products)</small>
          </div>
 
          <div class="text-dark pt-1"> 
            <span class="text-dark pr-3"><small class="font-weight-bold">Sort By</small></span>
            <div class="px-2 pb-1 d-inline-block small active-sort-by" onclick=""> Popularity </div>
            <div class="px-2 pb-1 d-inline-block small" onclick=""> Price -- Low to High </div>
            <div class="px-2 pb-1 d-inline-block small" onclick=""> Price -- High to Low </div>
            <div class="px-2 pb-1 d-inline-block small" onclick=""> Newest First </div>
          </div>
 
          <hr class="p-0 m-0 mb-2">
           
          <div class="row m-0" style="">
 
            <div class="col-sm-6 col-md-3 mb-3 product-card" style="position: relative;z-index: 1;">
              <div class="">
                <a href="#" class="d-block text-decoration-none product-link">
                  <div style="height:320px;width:100%;overflow-y: hidden;">
                    <img class="card-img-top" style="height:100%; width:100%;" src="https://www.w3schools.com/bootstrap4/img_avatar1.png" alt="Product image">
                  </div>
                  <div class="p-2">
                    <h6 class="text-secondary mb-0">Brand Name</h6>
                    <p class="text-dark mb-1">Some example text some example...</p>
                    <span class="fas fa-rupee-sign text-dark">305  </span>
                    <del class="fas fa-rupee-sign text-secondary">1399 </del>
                    <span class="text-success font-weight-bold">  78% off</span>
                  </div>
                </a>
              </div>
            </div>
 
            <div class="col-sm-6 col-md-3 mb-3 product-card" style="position: relative;z-index: 1;">
              <div class="">
                <a href="#" class="d-block text-decoration-none product-link">
                  <div style="height:320px;width:100%;overflow-y: hidden;">
                    <img class="card-img-top" style="height:100%; width:100%;" src="https://www.w3schools.com/bootstrap4/img_avatar1.png" alt="Product image">
                  </div>
                  <div class="p-2">
                    <h6 class="text-secondary mb-0">Brand Name</h6>
                    <p class="text-dark mb-1">Some example text some example...</p>
                    <span class="fas fa-rupee-sign text-dark">305  </span>
                    <del class="fas fa-rupee-sign text-secondary">1399 </del>
                    <span class="text-success font-weight-bold">  78% off</span>
                  </div>
                </a>
              </div>
            </div>
 
            <div class="col-sm-6 col-md-3 mb-3 product-card" style="position: relative;z-index: 1;">
              <div class="">
                <a href="#" class="d-block text-decoration-none product-link">
                  <div style="height:320px;width:100%;overflow-y: hidden;">
                    <img class="card-img-top" style="height:100%; width:100%;" src="https://www.w3schools.com/bootstrap4/img_avatar1.png" alt="Product image">
                  </div>
                  <div class="p-2">
                    <h6 class="text-secondary mb-0">Brand Name</h6>
                    <p class="text-dark mb-1">Some example text some example...</p>
                    <span class="fas fa-rupee-sign text-dark">305  </span>
                    <del class="fas fa-rupee-sign text-secondary">1399 </del>
                    <span class="text-success font-weight-bold">  78% off</span>
                  </div>
                </a>
              </div>
            </div>
 
            <div class="col-sm-6 col-md-3 mb-3 product-card" style="position: relative;z-index: 1;">
              <div class="">
                <a href="#" class="d-block text-decoration-none product-link">
                  <div style="height:320px;width:100%;overflow-y: hidden;">
                    <img class="card-img-top" style="height:100%; width:100%;" src="https://www.w3schools.com/bootstrap4/img_avatar1.png" alt="Product image">
                  </div>
                  <div class="p-2">
                    <h6 class="text-secondary mb-0">Brand Name</h6>
                    <p class="text-dark mb-1">Some example text some example...</p>
                    <span class="fas fa-rupee-sign text-dark">305  </span>
                    <del class="fas fa-rupee-sign text-secondary">1399 </del>
                    <span class="text-success font-weight-bold">  78% off</span>
                  </div>
                </a>
              </div>
            </div>
 
            <div class="col-sm-6 col-md-3 mb-3 product-card" style="position: relative;z-index: 1;">
              <div class="">
                <a href="#" class="d-block text-decoration-none product-link">
                  <div style="height:320px;width:100%;overflow-y: hidden;">
                    <img class="card-img-top" style="height:100%; width:100%;" src="https://www.w3schools.com/bootstrap4/img_avatar1.png" alt="Product image">
                  </div>
                  <div class="p-2">
                    <h6 class="text-secondary mb-0">Brand Name</h6>
                    <p class="text-dark mb-1">Some example text some example...</p>
                    <span class="fas fa-rupee-sign text-dark">305  </span>
                    <del class="fas fa-rupee-sign text-secondary">1399 </del>
                    <span class="text-success font-weight-bold">  78% off</span>
                  </div>
                </a>
              </div>
            </div>
 
            <div class="col-sm-6 col-md-3 mb-3 product-card" style="position: relative;z-index: 1;">
              <div class="">
                <a href="#" class="d-block text-decoration-none product-link">
                  <div style="height:320px;width:100%;overflow-y: hidden;">
                    <img class="card-img-top" style="height:100%; width:100%;" src="https://www.w3schools.com/bootstrap4/img_avatar1.png" alt="Product image">
                  </div>
                  <div class="p-2">
                    <h6 class="text-secondary mb-0">Brand Name</h6>
                    <p class="text-dark mb-1">Some example text some example...</p>
                    <span class="fas fa-rupee-sign text-dark">305  </span>
                    <del class="fas fa-rupee-sign text-secondary">1399 </del>
                    <span class="text-success font-weight-bold">  78% off</span>
                  </div>
                </a>
              </div>
            </div>
 
            <div class="col-sm-6 col-md-3 mb-3 product-card" style="position: relative;z-index: 1;">
              <div class="">
                <a href="#" class="d-block text-decoration-none product-link">
                  <div style="height:320px;width:100%;overflow-y: hidden;">
                    <img class="card-img-top" style="height:100%; width:100%;" src="https://www.w3schools.com/bootstrap4/img_avatar1.png" alt="Product image">
                  </div>
                  <div class="p-2">
                    <h6 class="text-secondary mb-0">Brand Name</h6>
                    <p class="text-dark mb-1">Some example text some example...</p>
                    <span class="fas fa-rupee-sign text-dark">305  </span>
                    <del class="fas fa-rupee-sign text-secondary">1399 </del>
                    <span class="text-success font-weight-bold">  78% off</span>
                  </div>
                </a>
              </div>
            </div>
 
            <div class="col-sm-6 col-md-3 mb-3 product-card" style="position: relative;z-index: 1;">
              <div class="">
                <a href="#" class="d-block text-decoration-none product-link">
                  <div style="height:320px;width:100%;overflow-y: hidden;">
                    <img class="card-img-top" style="height:100%; width:100%;" src="https://www.w3schools.com/bootstrap4/img_avatar1.png" alt="Product image">
                  </div>
                  <div class="p-2">
                    <h6 class="text-secondary mb-0">Brand Name</h6>
                    <p class="text-dark mb-1">Some example text some example...</p>
                    <span class="fas fa-rupee-sign text-dark">305  </span>
                    <del class="fas fa-rupee-sign text-secondary">1399 </del>
                    <span class="text-success font-weight-bold">  78% off</span>
                  </div>
                </a>
              </div>
            </div>
 
            <div class="col-sm-6 col-md-3 mb-3 product-card" style="position: relative;z-index: 1;">
              <div class="">
                <a href="#" class="d-block text-decoration-none product-link">
                  <div style="height:320px;width:100%;overflow-y: hidden;">
                    <img class="card-img-top" style="height:100%; width:100%;" src="https://www.w3schools.com/bootstrap4/img_avatar1.png" alt="Product image">
                  </div>
                  <div class="p-2">
                    <h6 class="text-secondary mb-0">Brand Name</h6>
                    <p class="text-dark mb-1">Some example text some example...</p>
                    <span class="fas fa-rupee-sign text-dark">305  </span>
                    <del class="fas fa-rupee-sign text-secondary">1399 </del>
                    <span class="text-success font-weight-bold">  78% off</span>
                  </div>
                </a>
              </div>
            </div>
 
            <div class="col-sm-6 col-md-3 mb-3 product-card" style="position: relative;z-index: 1;">
              <div class="">
                <a href="#" class="d-block text-decoration-none product-link">
                  <div style="height:320px;width:100%;overflow-y: hidden;">
                    <img class="card-img-top" style="height:100%; width:100%;" src="https://www.w3schools.com/bootstrap4/img_avatar1.png" alt="Product image">
                  </div>
                  <div class="p-2">
                    <h6 class="text-secondary mb-0">Brand Name</h6>
                    <p class="text-dark mb-1">Some example text some example...</p>
                    <span class="fas fa-rupee-sign text-dark">305  </span>
                    <del class="fas fa-rupee-sign text-secondary">1399 </del>
                    <span class="text-success font-weight-bold">  78% off</span>
                  </div>
                </a>
              </div>
            </div>
 
            <div class="col-sm-6 col-md-3 mb-3 product-card" style="position: relative;z-index: 1;">
              <div class="">
                <a href="#" class="d-block text-decoration-none product-link">
                  <div style="height:320px;width:100%;overflow-y: hidden;">
                    <img class="card-img-top" style="height:100%; width:100%;" src="https://www.w3schools.com/bootstrap4/img_avatar1.png" alt="Product image">
                  </div>
                  <div class="p-2">
                    <h6 class="text-secondary mb-0">Brand Name</h6>
                    <p class="text-dark mb-1">Some example text some example...</p>
                    <span class="fas fa-rupee-sign text-dark">305  </span>
                    <del class="fas fa-rupee-sign text-secondary">1399 </del>
                    <span class="text-success font-weight-bold">  78% off</span>
                  </div>
                </a>
              </div>
            </div>
 
            <div class="col-sm-6 col-md-3 mb-3 product-card" style="position: relative;z-index: 1;">
              <div class="">
                <a href="#" class="d-block text-decoration-none product-link">
                  <div style="height:320px;width:100%;overflow-y: hidden;">
                    <img class="card-img-top" style="height:100%; width:100%;" src="https://www.w3schools.com/bootstrap4/img_avatar1.png" alt="Product image">
                  </div>
                  <div class="p-2">
                    <h6 class="text-secondary mb-0">Brand Name</h6>
                    <p class="text-dark mb-1">Some example text some example...</p>
                    <span class="fas fa-rupee-sign text-dark">305  </span>
                    <del class="fas fa-rupee-sign text-secondary">1399 </del>
                    <span class="text-success font-weight-bold">  78% off</span>
                  </div>
                </a>
              </div>
            </div>
 
          </div>
 
          <hr class="p-0 m-0 mb-2">
 
          <div class="">
            <small class="text-dark"> Page 1 of 2,022 </small>
            <ul class="pagination justify-content-center pagination-sm " >
              <li class="page-item"><a class="page-link" href="#">Previous</a></li>
              <li class="page-item"><a class="page-link" href="#">1</a></li>
              <li class="page-item active"><a class="page-link" href="#">2</a></li>
              <li class="page-item"><a class="page-link" href="#">3</a></li>
              <li class="page-item"><a class="page-link" href="#">Next</a></li>
            </ul>
          </div>
        </div>
        <!-- Result Contents section start-->
 
      </div>
    </div>
  </body>
</html>