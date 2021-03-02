import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productodelcarrito`
 *
 * VistaProductodelcarrito element.
 *
 * @customElement
 * @polymer
 */
class VistaProductodelcarrito extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-productodelcarrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductodelcarrito.is, VistaProductodelcarrito);
