import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productodelpedido`
 *
 * VistaProductodelpedido element.
 *
 * @customElement
 * @polymer
 */
class VistaProductodelpedido extends PolymerElement {

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
        return 'vista-productodelpedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductodelpedido.is, VistaProductodelpedido);
